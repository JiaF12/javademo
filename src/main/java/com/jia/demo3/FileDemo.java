package com.jia.demo3;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    @Test
    public void test1() throws IOException {

        File file = new File("D:/test");
//        file.createNewFile();


    }
    static Long ll = 0L;

    public static void main(String[] args) {
        File file = new File("D:/aaa");
//        delAllFile(file);
        fileLenght(file);
        System.out.println(ll.toString());
    }


    public static void delAllFile(File file) {
        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            } else {
                delAllFile(file1);
            }
        }
        file.delete();
    }

    public static void fileLenght(File file) {
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isFile()) {
                ll += listFile.length();
            } else {
                fileLenght(listFile);
            }
        }

    }


}
