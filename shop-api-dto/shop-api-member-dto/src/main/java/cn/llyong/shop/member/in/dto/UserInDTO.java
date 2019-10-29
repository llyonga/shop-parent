package cn.llyong.shop.member.in.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @description: 用户信息
 * @author: lvyong
 * @date: 2019-10-29
 * @time: 4:30 下午
 * @version: 1.0
 */
@Data
@ApiModel(value = "用户信息")
public class UserInDTO {

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
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userId\":")
                .append(userId);
        sb.append(",\"mobile\":\"")
                .append(mobile).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"sex\":")
                .append(sex);
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"picImg\":\"")
                .append(picImg).append('\"');
        sb.append(",\"qqOpenId\":\"")
                .append(qqOpenId).append('\"');
        sb.append(",\"wxOpenId\":\"")
                .append(wxOpenId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
