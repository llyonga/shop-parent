package cn.llyong.shop.core.error;

import cn.llyong.shop.base.BaseApiService;
import cn.llyong.shop.base.BaseResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/30
 * @time: 21:46
 * @version: 1.0
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends BaseApiService<JSONObject> {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public BaseResponse<JSONObject> exceptionHandler(Exception e) {
        log.info("捕获全局异常，error：{}", e);
        return setResultError("系统错误");
    }
}
