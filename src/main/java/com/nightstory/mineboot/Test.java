package com.nightstory.mineboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xuyangyang
 * @Date: 2020/7/6
 */
public class Test {


    public static void main(String[] args) {

    }

    boolean areTwoStringsAnagram(String textA, String textB) {
        if (textA == null || textB == null) {
            return false;
        }
        if (textA.length() != textB.length()) {
            return false;
        }
        char[] arrayA = textA.toCharArray();
        Arrays.sort(arrayA);
        char[] arrayB = textB.toCharArray();
        Arrays.sort(arrayB);
        return String.valueOf(arrayA).equals(String.valueOf(arrayB));

    }

    void sort(List<Integer> list) {
        if (list == null) {
            return;
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(a[i]);
        }
    }


    int cal(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return cal(n - 1) + cal(n - 2);
    }

    public int fib(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }


}
