package cn.llyong.service;

import cn.llyong.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:13
 * @version: 1.0
 */
public interface MemberService {

    /**
     * 调用微信
     * @return
     */
    @GetMapping("memberInvokeWeiXin")
    public AppEntity memberInvokeWeiXin();
}
