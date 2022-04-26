package com.jia.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo2 {


    public static void main(String[] args) throws Exception {
        Class<Person> clazz = Person.class;
        //通过反射，创建person对象
        Constructor<Person> cons = clazz.getConstructor(String.class, String.class);
        Person person = cons.newInstance("Tom", "18");
        System.out.println(person.toString());
        //通过反射，调用对象指定属性
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, "22");
        System.out.println(person);
        //调用方法
        Method printShow = clazz.getDeclaredMethod("printShow");
        printShow.setAccessible(true);
        printShow.invoke(person);
    }


}
