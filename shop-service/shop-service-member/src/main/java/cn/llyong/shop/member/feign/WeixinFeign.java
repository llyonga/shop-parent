package cn.llyong.shop.member.feign;

import cn.llyong.shop.member.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:28
 * @version: 1.0
 */
@FeignClient(name = "app-weixin")
public interface WeixinFeign extends WeiXinService {
}
