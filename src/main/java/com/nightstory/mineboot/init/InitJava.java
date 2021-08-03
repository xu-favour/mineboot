package com.nightstory.mineboot.init;

import java.util.HashMap;

/**
 * @Author: putao
 * @Date: 2019/6/25
 */
public class InitJava {

    public static void main(String[] args) {
        // byte char short int long float double boolean.
        // String reference.
        // 封装: public private default protected.
        // 继承: extends
        // 多态: 重载,覆盖(重写)
        // abstract interface
        // 修饰符:static final
        // 泛型,反射,枚举,注解
        // 线程
        // 集合,并发包
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 10000; i++){
                    if(i > 1000){
                        i = 0;
                    }
                }
            }
        }).start();
        System.out.println("end");
    }

    public static int test(String riskUserGrade){
        char temp;
        if (riskUserGrade.length() != 1 || (temp = riskUserGrade.toUpperCase().charAt(0)) < 'A' || temp > 'Z') {
            return -1;
        }
        return 0;
    }
}
