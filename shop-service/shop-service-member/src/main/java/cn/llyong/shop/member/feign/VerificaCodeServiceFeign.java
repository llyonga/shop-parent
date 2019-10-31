package cn.llyong.shop.member.feign;

import cn.llyong.shop.weixin.VerificaCodeService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-31
 * @time: 11:22 上午
 * @version: 1.0
 */
@FeignClient(name = "app-weixin")
public interface VerificaCodeServiceFeign extends VerificaCodeService {
}
