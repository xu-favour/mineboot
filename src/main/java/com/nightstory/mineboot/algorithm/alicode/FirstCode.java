package com.nightstory.mineboot.algorithm.alicode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xyy
 * @Date: 2020/9/1
 */
public class FirstCode {

    public static void main(String[] args) throws InterruptedException {
        syncMonkey();
    }

    static Lock lock = new ReentrantLock();
    static Condition orderCon = lock.newCondition();
    static int appleCount = 9;

    public static void syncMonkey(){

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (eatApple(2) > 0){

                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (eatApple(3) > 0){

                }
            }
        });
        th1.start();
        th2.start();
    }
    public static int eatApple(int size) {
        lock.lock();
        try {
            if(appleCount < size){
                return 0;
            }
            appleCount = appleCount - size;
            System.out.println(Thread.currentThread().getId() + ", 吃了" + size + "个苹果");
            orderCon.signal();
            orderCon.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return 1;
    }


    public static void yangHuiTriangle(){
        int[][] arrays = new int[10][];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i) {
                    arrays[i][j] = 1;
                } else {
                    arrays[i][j] = arrays[i-1][j] + arrays[i-1][j-1];
                }
                // 输出数组元素
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
