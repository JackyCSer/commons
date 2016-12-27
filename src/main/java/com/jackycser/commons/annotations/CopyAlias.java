package com.jackycser.commons.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jacky Zhang
 * @since 27/12/2016
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CopyAlias {
    /**
     * Field 的别名
     *
     * @return
     */
    String value() default "";
}
