package com.nightstory.mineboot.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: putao
 * @Date: 2018/12/26
 */
public class LinkHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "item1");
        linkedHashMap.put(2, "item2");
        linkedHashMap.put(3, "item3");
        linkedHashMap.get(2);
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey());
        }
    }
}
