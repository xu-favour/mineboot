package com.nightstory.mineboot.java.genericity;

public class Node<T> {
    private T data;
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}