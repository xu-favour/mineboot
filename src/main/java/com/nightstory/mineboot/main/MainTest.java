package com.nightstory.mineboot.main;

import com.nightstory.mineboot.pattern.singleton.SingletonEnum;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author: putao
 * @Date: 2018/12/22
 */
public class MainTest {

    static {
        System.out.println("MainTest init");
    }

    public static void main(String[] args) throws Exception {
//        Class<?>[] interfaces = Axx.class.getInterfaces();
//        System.out.println(interfaces[0]);
//        System.out.println(MessageInterface.class.getInterfaces().length);
//        Class<?> cl = MessageInterface.class;
        SingletonEnum.INSTANCE.whateverMethod();

        URL url = new URL("https://google.com");
        URLConnection connection = url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        byte[] bytes = new byte[1024];
        while (inputStream.read(bytes) >= 0) {
            System.out.println(new String(bytes));
        }

    }

    public static int[] getTypeArray(String type) {
        String[] strArray = type.split(",");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            try {
                intArray[i] = Integer.valueOf(strArray[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return intArray;
    }
}

class TestClass {
    final int a;

    static {
        System.out.println("TestClass init ");
    }

    public TestClass() {
        a = 1;
    }
}
