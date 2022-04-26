package com.jia.demo7;

import org.junit.Test;

import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        Stream<String> stringStream = list.parallelStream();
//        Stream.iterate(0,t -> t + 2).limit(10).forEach(System.out::println);
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);


        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        list1.stream().map(String::toUpperCase).forEach(System.out::println);

        ArrayList<Hum> hums = new ArrayList<>();
        hums.add(new Hum(1001, "马化腾", 34, 6000.0));
        hums.add(new Hum(1002, "马云", 23, 7000.0));
        hums.add(new Hum(1003, "刘强东", 51, 4700.0));
        hums.add(new Hum(1004, "雷军", 41, 8100.0));
        hums.add(new Hum(1005, "李彦宏", 36, 6600.0));
        hums.add(new Hum(1006, "比尔盖茨", 62, 9400.0));
        hums.add(new Hum(1007, "任正非", 31, 7700.0));
        hums.add(new Hum(1008, "扎克伯格", 33, 2500.0));

        hums.stream().map(Hum::getName).filter(name -> name.length() > 3).forEach(System.out::println);

    }

    @Test
    public void test44() {
        //冒泡排序
        int[] nums = new int[]{1,23,4,5,67,7};

//** dawf /
        System.out.println(nums.length);


    }

    @Test
    public void test1() {
        ArrayList<Hum> hums = new ArrayList<>();
        hums.add(new Hum(1001, "马化腾", 34, 6000.0));
        hums.add(new Hum(1002, "马云", 23, 7000.0));
        hums.add(new Hum(1003, "刘强东", 51, 4700.0));
        hums.add(new Hum(1004, "雷军", 41, 8100.0));
        hums.add(new Hum(1005, "李彦宏", 36, 6600.0));
        hums.add(new Hum(1006, "比尔盖茨", 62, 9400.0));
        hums.add(new Hum(1007, "任正非", 31, 7700.0));
        hums.add(new Hum(1008, "扎克伯格", 33, 2500.0));


        List<Integer> list = Arrays.asList(123, 41, 51, 63, 64);
        list.stream().sorted().forEach(System.out::println);
        //定制排序
        hums.stream().sorted(Comparator.comparingInt(Hum::getArg)).forEach(System.out::println);

    }

    @Test
    public void test2() {
        //计算和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //Optional<Integer> sum = list.stream().reduce((d1, d2) -> d1 + d2);
        Integer sum = list.stream().reduce(0, Integer::sum);//0:初始值
        System.out.println(sum);
    }
}

