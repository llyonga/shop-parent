package cn.llyong.service;

import cn.llyong.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:11
 * @version: 1.0
 */
public interface WeiXinService {

    /**
     * 获取app
     * @return
     */
    @GetMapping("getApp")
    public AppEntity getApp();
}
