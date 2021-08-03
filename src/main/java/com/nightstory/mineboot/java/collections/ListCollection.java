package com.nightstory.mineboot.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: putao
 * @Date: 2019/4/18
 */
public class ListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("1");
        linkedList.push("2");
        System.out.println(linkedList.pop());
        System.out.println(linkedList.size());
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("1");
    }
}
