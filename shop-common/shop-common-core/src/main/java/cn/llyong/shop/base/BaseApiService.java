package cn.llyong.shop.base;

import cn.llyong.shop.constants.Constants;
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
        return setResult(code, msg, null);
    }

    /**
     * 返回错误，可以传msg
     * @param msg
     * @return
     */
    public BaseResponse<T> setResultError(String msg) {
        return setResult(Constants.HTTP_RES_CODE_500, msg, null);
    }

    /**
     * 返回成功，可以传data值
     * @param data
     * @return
     */
    public BaseResponse<T> setResultSuccess(T data) {
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
    }

    /**
     * 返回成功，沒有data值
     * @return
     */
    public BaseResponse<T> setResultSuccess() {
        return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
    }

    /**
     * 返回成功，沒有data值
     * @param msg
     * @return
     */
    public BaseResponse<T> setResultSuccess(String msg) {
        return setResult(Constants.HTTP_RES_CODE_200, msg, null);
    }

    /**
     * 通用封装
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public BaseResponse<T> setResult(Integer code, String msg, T data) {
        return new BaseResponse<T>(code, msg, data);
    }

    /**
     * 调用数据库层判断
     * @param result
     * @return
     */
    public Boolean toDaoResult(int result) {
        return result > 0 ? true : false;
    }

    /**
     * 接口直接返回true 或者false
     * @param baseResp
     * @return
     */
    public Boolean isSuccess(BaseResponse<?> baseResp) {
        if (baseResp == null) {
            return false;
        }
        if (baseResp.getCode().equals(Constants.HTTP_RES_CODE_500)) {
            return false;
        }
        return true;
    }
}
