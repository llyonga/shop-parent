package cn.llyong.shop.member.out.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 用户返回参数
 * @author: lvyong
 * @date: 2019-10-29
 * @time: 4:32 下午
 * @version: 1.0
 */
@Data
@ApiModel(value = "用户返回参数")
public class UserOutDTO {

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;
    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobile;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String userName;
    /**
     * 性别 0 男 1女
     */
    @ApiModelProperty(value = "用户性别")
    private char sex;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "用户年龄")
    private Integer age;
    /**
     * 注册时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 修改时间
     *
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;
    /**
     * 账号是否可以用 1 正常 0冻结
     */
    @ApiModelProperty(value = "账号是否可以用 1 正常 0冻结")
    private char isAvalible;
    /**
     * 用户头像
     */
    @ApiModelProperty(value = " 用户头像")
    private String picImg;
    /**
     * 用户关联 QQ 开放ID
     */
    @ApiModelProperty(value = "用户关联 QQ 开放ID")
    private String qqOpenId;
    /**
     * 用户关联 微信 开放ID
     */
    @ApiModelProperty(value = "用户关联 微信 开放ID")
    private String wxOpenId;

    private Boolean isVip;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userId\":")
                .append(userId);
        sb.append(",\"mobile\":\"")
                .append(mobile).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"sex\":")
                .append(sex);
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"createTime\":\"")
                .append(createTime).append('\"');
        sb.append(",\"updateTime\":\"")
                .append(updateTime).append('\"');
        sb.append(",\"isAvalible\":")
                .append(isAvalible);
        sb.append(",\"picImg\":\"")
                .append(picImg).append('\"');
        sb.append(",\"qqOpenId\":\"")
                .append(qqOpenId).append('\"');
        sb.append(",\"wxOpenId\":\"")
                .append(wxOpenId).append('\"');
        sb.append(",\"isVip\":")
                .append(isVip);
        sb.append('}');
        return sb.toString();
    }
}
