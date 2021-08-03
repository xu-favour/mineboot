package com.nightstory.mineboot.java.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/8
 */
public class Solution {

    Object monitor = new Object();
    int num = 1;
    public void print()  {
        synchronized (monitor){
            while (num <= 100){
                System.out.println(Thread.currentThread().getId() + " , "  + num);
                num++;
                monitor.notify();
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void printOfTwo(){
        lock.lock();
        try {
            while (num <= 100){
                System.out.println(Thread.currentThread().getId() + " , "  + num);
                num++;
                condition.signal();
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }





    public static void main(String[] args) throws InterruptedException {
        Solution solution = new Solution();
        Thread th1 = new Thread(() -> {
            solution.printOfTwo();
        });
        Thread th2 = new Thread(() -> {
            solution.printOfTwo();
        });
        th1.start();
        th2.start();
        Thread.sleep(100000);
    }
}
