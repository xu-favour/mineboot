package com.nightstory.mineboot.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: putao
 * @Date: 2018/12/28
 */
public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor tp = new ThreadPoolExecutor(1,2,100, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), new ThreadPoolExecutor.AbortPolicy());
        tp.execute(() -> {
            System.out.println(Thread.currentThread().getId());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        tp.execute(() -> System.out.println(Thread.currentThread().getId()));
        tp.execute(() -> System.out.println(Thread.currentThread().getId()));
        while (true){
            Thread.sleep(1000);
            tp.execute(() -> {
                System.out.println(Thread.currentThread().getId());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
