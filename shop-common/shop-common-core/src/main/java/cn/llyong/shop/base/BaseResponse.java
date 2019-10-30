package cn.llyong.shop.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;
}
