package cn.llyong.shop.base;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-30
 * @time: 9:39 上午
 * @version: 1.0
 */
@Data
@Component
public class BaseApiService<T> {

    public BaseResponse<T> setResultError(Integer code, String msg) {
        return new BaseResponse<T>(code, msg, null);
    }


}
