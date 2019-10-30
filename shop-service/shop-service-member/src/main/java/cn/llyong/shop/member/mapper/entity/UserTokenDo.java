package cn.llyong.shop.member.mapper.entity;

import cn.llyong.shop.base.BaseDo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019/10/30
 * @time: 2:29 下午
 * @version: 1.0
 */
@Data
public class UserTokenDo extends BaseDo {
	/**
	 * id
	 */
	private Long id;
	/**
	 * 用户token
	 */
	private String token;
	/**
	 * 登陆类型
	 */
	private String loginType;

	/**
	 * 设备信息
	 */
	private String deviceInfor;
	/**
	 * 用户userId
	 */
	private Long userId;

}
