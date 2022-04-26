package com.jia.demo2;

import org.junit.Test;

import java.util.*;

public class JavaDemo1 {

    @Test
    public void test2() {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else {
                    throw new RuntimeException("输入类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User("cc", 12));
        set.add(new User("aa", 22));
        set.add(new User("dd", 2));
        set.add(new User("aa", 72));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    @Test
    public void test3() {
        HashSet hashSet = new HashSet();
        hashSet.add("dd");
        hashSet.add("aa");
        hashSet.add("cc");
    }

    @Test
    public void test4() {
        //创建并初始化 List
        List<User> list = new ArrayList<User>() {{
            add(new User("Jesse", 30));
            add(new User("luxi", 10));
            add(new User("Jack", 40));
        }};
        HashMap<Object, Object> a = new HashMap<>();
        // 使⽤ Comparable ⾃定的规则进⾏排序
        Collections.sort(list);
        // 打印 list 集合
        list.forEach(p ->

        {
            System.out.println(p);
        });
    }


    @Test
    public void test5() {
        ArrayList<Integer> f = new ArrayList<>();
        f.add(15);
        f.add(51);
        f.add(73);
        Collections.reverse(f);
        f.forEach(System.out::println);

    }
}
