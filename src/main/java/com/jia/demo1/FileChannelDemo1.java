package com.jia.demo1;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo1 {
    //FileChannel 读取数据到Buffer中
    public static void main(String[] args) throws Exception {
        //创建FileChannel
        RandomAccessFile aFile = new RandomAccessFile("C:\\Users\\jiaf9\\Desktop\\redis.conf", "rw");
        FileChannel channel = aFile.getChannel();
        //创建buffer
        ByteBuffer buf = ByteBuffer.allocate(1024);
        //读取数据到buffer
        int bytesRead = channel.read(buf);
        while (bytesRead != -1) {
            System.out.println("读取了：" + bytesRead);
            buf.flip();

        }
    }
}
