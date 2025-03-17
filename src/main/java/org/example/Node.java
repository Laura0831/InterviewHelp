package org.example;

public class Node {

    String value;
    Node next;

    Node(String val){
        value = val;
        next = null;
    }






    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
