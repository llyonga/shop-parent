package cn.llyong.shop.member.service;

import cn.llyong.shop.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:11
 * @version: 1.0
 */
@Api(tags = "微信服务接口")
public interface WeiXinService {

    /**
     * 获取app
     * @return
     */
    @ApiOperation("获取微信信息")
    @GetMapping("getApp")
    public AppEntity getApp();
}
