package com.nightstory.mineboot.java.base;

import java.util.*;

public class Test {

    ArrayList<Integer> list = new ArrayList<Integer>();
    Map<String,String> map = new HashMap<String,String>();

    public static void main(String[] args) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);  //这样调用 add 方法只能存储整形，因为泛型类型的实例为 Integer

        list.getClass().getMethod("add", Object.class).invoke(list, "asd");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        for(int i = 0; i < firstStr.length(); i++){

        }
        return "";
    }

}