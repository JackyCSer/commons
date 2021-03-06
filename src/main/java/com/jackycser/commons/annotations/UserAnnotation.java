package com.jackycser.commons.annotations;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Jacky Zhang
 * @since 27/12/2016
 */
@TestA(name = "type", gid = Long.class) //类成员注解
public class UserAnnotation {

    @TestA(name = "param", id = 1, gid = Long.class) //类成员注解
    @CopyAlias("oldAge")
    private Integer age;

    @CopyAlias("firstName")
    private Integer name;

    @TestA(name = "construct", id = 2, gid = Long.class)//构造方法注解
    public UserAnnotation() {

    }

    @TestA(name = "public method", id = 3, gid = Long.class) //类方法注解
    public void a() {
        Map<String, String> m = new HashMap<String, String>(0);
    }

    @TestA(name = "protected method", id = 4, gid = Long.class) //类方法注解
    protected void b() {
        Map<String, String> m = new HashMap<String, String>(0);
    }

    @TestA(name = "private method", id = 5, gid = Long.class) //类方法注解
    private void c() {
        Map<String, String> m = new HashMap<String, String>(0);
    }

    public void b(Integer a) {

    }
}