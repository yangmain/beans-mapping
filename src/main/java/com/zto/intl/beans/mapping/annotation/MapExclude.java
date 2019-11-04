package com.zto.intl.beans.mapping.annotation;

import java.lang.annotation.*;

/**
 * @author panyujiang
 * @desc exclude field
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MapExclude {
}

