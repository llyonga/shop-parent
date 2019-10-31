package cn.llyong.shop.member.service.impl;

import cn.llyong.shop.base.BaseApiService;
import cn.llyong.shop.base.BaseResponse;
import cn.llyong.shop.constants.Constants;
import cn.llyong.shop.core.bean.MappingBeanUtils;
import cn.llyong.shop.core.utils.MD5Util;
import cn.llyong.shop.member.MemberRegisterService;
import cn.llyong.shop.member.feign.VerificaCodeServiceFeign;
import cn.llyong.shop.member.in.dto.UserInDTO;
import cn.llyong.shop.member.mapper.UserMapper;
import cn.llyong.shop.member.mapper.entity.UserDo;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-31
 * @time: 11:20 上午
 * @version: 1.0
 */
@RestController
public class MemberRegisterServiceImpl extends BaseApiService<JSONObject> implements MemberRegisterService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VerificaCodeServiceFeign verificaCodeServiceFeign;

    @Transactional
    public BaseResponse<JSONObject> register(@RequestBody UserInDTO userInDTO, String registCode) {
        // 1.参数验证
        // String userName = userInDTO.getUserName();
        // if (StringUtils.isEmpty(userName)) {
        // return setResultError("用户名称不能为空!");
        // }
        String mobile = userInDTO.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return setResultError("手机号码不能为空!");
        }
        String password = userInDTO.getPassword();
        if (StringUtils.isEmpty(password)) {
            return setResultError("密码不能为空!");
        }
        // // 2.验证码注册码是否正确 暂时省略 会员调用微信接口实现注册码验证
        BaseResponse<JSONObject> verificaWeixinCode = verificaCodeServiceFeign.verificaWeixinCode(mobile, registCode);
        if (!verificaWeixinCode.getCode().equals(Constants.HTTP_RES_CODE_200)) {
            return setResultError(verificaWeixinCode.getMsg());
        }
        // 3.对用户的密码进行加密 // MD5 可以解密 暴力破解
        String newPassword = MD5Util.MD5(password);
        userInDTO.setPassword(newPassword);
        // 4.调用数据库插入数据 将请求的dto参数转换DO
        UserDo userDo = MappingBeanUtils.dtoToDo(userInDTO, UserDo.class);
        return userMapper.register(userDo) > 0 ? setResultSuccess("注册成功") : setResultError("注册失败!");
    }
    // dto 和do 可能 实体类不同，但是部分参数可能相同

}