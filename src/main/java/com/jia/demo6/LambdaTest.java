package com.jia.demo6;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {

    //语法格式一：无参，无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("00000");
            }
        };
        r1.run();
        //-------------------------
        Runnable r2 = () -> System.out.println("111111");
        r2.run();


    }

    @Test
    public void test2() {
//
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("aaaaaa");
        //------------------------------
        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("aaaaaa");


    }

    @Test
    public void test3() {
        Comparator com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        //-------------------------------
        Comparator<Integer> com2 = (o1, o2) -> {
           return o1.compareTo(o2);
        };
    }
}
