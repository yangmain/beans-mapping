package com.zto.intl.beans.mapping.annotation;


import java.lang.annotation.*;

/**
 * @author panyujiang
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MapField {

    String MAP_DELIMITERS = "=";
    String MULTI_MAP_DELIMITERS = ",";
    /**
     * the mapping field
     *
     * @return
     */
    String value() default "";

    /**
     * make to support list, array, object mapping
     * <p>
     * format: complexMap="aClassField[0]=bClassFileda,fielda[1]=bClassFiledb"
     *
     * @return
     */
    String complexMap() default "";
}
