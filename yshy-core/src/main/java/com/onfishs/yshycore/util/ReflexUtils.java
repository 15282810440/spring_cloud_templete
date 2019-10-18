package com.onfishs.yshycore.util;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * 反射工具类
 */
public class ReflexUtils {

    private static final Logger log = LoggerFactory.getLogger(ReflexUtils.class);

    /**
     * 检查传入的对象 将所有的空字段变成空
     * 不接受 int float double等基础数据类型判断 所以传入对象处理的时候 需要检查
     */
    public static void checkEmptyIntoNull(Object model) {
        if(model == null){
            return;
        }
        Class clazz = model.getClass();
        Field[]  fields = clazz.getDeclaredFields();
        for(Field field : fields){
            try {
                field.setAccessible(true);
                String type = field.getGenericType().toString();
                if (type.equals("class java.lang.String")) {
                    String value = (String) field.get(model);
                    if (StringUtils.isBlank(value)) {
                            field.set(model, null);
                    }
                }
            } catch (IllegalAccessException e) {
                log.error("反射类 检查字符串空设置为null的处理发生异常", e);
            }
        }
    }

}
