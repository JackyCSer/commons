package com.jackycser.commons.engines;

import com.jackycser.commons.annotations.CopyAlias;
import com.jackycser.commons.annotations.TestA;
import com.jackycser.commons.annotations.UserAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author Jacky Zhang
 * @since 27/12/2016
 */
public class CopyAliasResolver {

    public static <T> void resolve(Class<T> copyClass) {
        Field[] fields = copyClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        for (Field f : fields) {

            boolean hasAnnotation = f.isAnnotationPresent(CopyAlias.class);
            if (hasAnnotation) {
                CopyAlias annotation = f.getAnnotation(CopyAlias.class);
                System.out.println(annotation.value());
            }
        }

    }

    public static void main(String[] args) {
        resolve(UserAnnotation.class);
    }
}
