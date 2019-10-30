package cn.llyong.shop.base;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019/10/30
 * @time: 2:28 下午
 * @version: 1.0
 */
@Data
public class BaseDo {
	/**
	 * 注册时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 *
	 */
	private Date updateTime;
	/**
	 * id
	 */
	private Long id;

	/**
	 * 是否可用 0可用 1不可用
	 */
	private Long isAvailability;
}