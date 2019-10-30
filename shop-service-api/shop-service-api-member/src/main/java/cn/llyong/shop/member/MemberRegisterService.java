package cn.llyong.shop.member;

import cn.llyong.shop.base.BaseApiService;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-30
 * @time: 3:24 下午
 * @version: 1.0
 */
@Api(tags = "会员注册接口")
public interface MemberRegisterService {


    BaseApiService<JSONObject> register() ;
}
