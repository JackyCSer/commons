package com.jackycser.commons.annotations;

/**
 * @author Jacky Zhang
 * @since 27/12/2016
 */
public @interface Complexity {
    ComplexityLevel value() default ComplexityLevel.MEDIUM;
}
