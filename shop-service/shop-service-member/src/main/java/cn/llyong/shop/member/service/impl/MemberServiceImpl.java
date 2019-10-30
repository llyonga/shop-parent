package cn.llyong.shop.member.service.impl;

import cn.llyong.shop.entity.AppEntity;
import cn.llyong.shop.member.feign.WeixinFeign;
import cn.llyong.shop.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:25
 * @version: 1.0
 */
@SuppressWarnings("ALL")
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeixinFeign weixinFeign;

    /**
     * 调用微信
     *
     * @return
     */
    @GetMapping("memberInvokeWeiXin")
    @Override
    public AppEntity memberInvokeWeiXin() {
        AppEntity appEntity = weixinFeign.getApp();
        return appEntity;
    }
}
