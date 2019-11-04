package com.zto.intl.beans.mapping.annotation;

import java.lang.annotation.*;


/**
 * @author panyujiang
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MapClass {
    /**
     * Set the class which need to be mapped with the annotated class
     * @return
     */
    String value() default "";
}
