package com.jia.demo3;

import java.io.*;
import java.util.LinkedHashMap;

public class StringDemo {

    public static void main(String[] args) throws Exception {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("d:/aa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/bb.txt"));
        int c = 0;
        while ((c = br.read()) != -1) {
            char str = (char) c;
            Integer num = map.get(str);
            if (null == num) {
                map.put(str, 1);
            } else {
                map.put(str, num + 1);
            }
        }
        map.forEach((k, v) -> {
            try {
                bw.write(k + "次数" + v + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.flush();
        br.close();
        bw.close();
    }


}
