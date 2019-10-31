package cn.llyong.shop.weixin.feign;

import cn.llyong.shop.member.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-31
 * @time: 9:39 上午
 * @version: 1.0
 */
@FeignClient(name = "app-member")
public interface MemberServiceFeign extends MemberService {
}
