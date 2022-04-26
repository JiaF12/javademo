package com.jia.demo4;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpDemo1 {

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8811);
            os = socket.getOutputStream();
            os.write("hello world 贾峰".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void server() {
        ByteArrayOutputStream baos = null;
        try {
            ServerSocket ss = new ServerSocket(8811);
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
//        byte[] buffer = new byte[1024];
//        int len;
//        while ((len = is.read(buffer)) != -1) {
//            String str = new String(buffer, 0, len);
//            System.out.println(str);
//        }
            baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len = is.read(buff)) != -1) {
                baos.write(buff, 0, len);
            }
            System.out.println(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeIo(AutoCloseable... autoCloseables) {
        if (autoCloseables == null) {
            return;
        }
        for (AutoCloseable a : autoCloseables) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
