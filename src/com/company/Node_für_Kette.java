package com.company;

public class Node_für_Kette {

    int val;

    @Override
    public String toString() {
        return "Node_für_Kette{" +
                "val=" + val +
                ", prev=" + prev +
                '}';
    }

    public Node_für_Kette(int val) {
        this.val = val;
    }

    Node_für_Kette next;
    Node_für_Kette prev;

}
