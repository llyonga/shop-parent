package cn.llyong.shop.member.service.impl;

import cn.llyong.shop.entity.AppEntity;
import cn.llyong.shop.member.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:15
 * @version: 1.0
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {
    /**
     * 获取app
     *
     * @return
     */
    @Override
    public AppEntity getApp() {
        return new AppEntity("zhangsan1234", "张三");
    }
}
