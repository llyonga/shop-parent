package cn.llyong.shop.member.service;

import cn.llyong.shop.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:13
 * @version: 1.0
 */
@Api(tags = "会员服务接口")
public interface MemberService {

    /**
     * 调用微信
     * @return
     */
    @ApiOperation("会员服务调用微信服务接口")
    @GetMapping("memberInvokeWeiXin")
    public AppEntity memberInvokeWeiXin();
}
