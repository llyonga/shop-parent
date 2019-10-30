package cn.llyong.shop.core.bean;

import org.springframework.beans.BeanUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-30
 * @time: 9:59 上午
 * @version: 1.0
 */
public class MappingBeanUtils {

    /**
     * dto 转换为Do 工具类
     *
     * @param dto
     * @param doClass
     * @return
     */
    public static <DO> DO dtoToDo(Object dto, Class<DO> doClass) {
        // 判断dto是否为空!
        if (dto == null) {
            return null;
        }
        // 判断DoClass 是否为空
        if (doClass == null) {
            return null;
        }
        try {
            DO newInstance = doClass.newInstance();
            BeanUtils.copyProperties(dto, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * do 转换为Dto 工具类
     *
     * @param doEntity
     * @param dtoClass
     * @return
     */
    public static <DTO> DTO doToDto(Object doEntity, Class<DTO> dtoClass) {
        // 判断dto是否为空!
        if (doEntity == null) {
            return null;
        }
        // 判断DoClass 是否为空
        if (dtoClass == null) {
            return null;
        }
        try {
            DTO newInstance = dtoClass.newInstance();
            BeanUtils.copyProperties(doEntity, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * do 转换为Dto 工具类 支持集合类型
     *
     * @param dtoClass
     * @param doEntity
     * @return
     */
    public static <DTO> DTO listDoToDto(Object doEntity, Class<DTO> dtoClass) {
        // 判断dto是否为空!
        if (doEntity == null) {
            return null;
        }
        // 判断DoClass 是否为空
        if (dtoClass == null) {
            return null;
        }
        try {
            DTO newInstance = dtoClass.newInstance();
            BeanUtils.copyProperties(doEntity, newInstance);
            // Dto转换Do
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

}
