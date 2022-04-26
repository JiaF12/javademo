package com.jia.demo4;

import org.junit.Test;

import java.lang.reflect.Method;

public class Demo3 {

    @Test
    public void test1() throws ClassNotFoundException {
        //获取Class实例的方式
        //方式一：调用运行时类的属性 .class
        Class<Person> clazz1 = Person.class;

        //方式二：通过运行时类的对象,调用.getClass()
        Person person = new Person();
        Class clazz2 = person.getClass();

        //方式三：调用Class的静态方法：farName(String classPath)
        Class clazz3 = Class.forName("com.jia.demo4.Person");

        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = Demo3.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.jia.demo4.Person");


    }


    @Test
    public void test2() throws InstantiationException, IllegalAccessException {

        Class<Person> clazz = Person.class;
        //newInstance(): 调用此方法，创建对应的运行时类对象
        Person person = clazz.newInstance();

    }


    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();

        Method show = clazz.getDeclaredMethod("printShow", String.class);
        show.setAccessible(true);
        //调用方法的invoke():参数1：方法的调用者； 参数2：给方法形参赋值的实参
        //invoke()的返回值即为对应类中调用的方法的返回值
        //如果调用的方法没有返回值，void。。则invoke()返回null
        Object retrunValue = show.invoke(person, "CHN");
        System.out.println(retrunValue);

    }
}
