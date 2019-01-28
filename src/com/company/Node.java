package com.company;

public class Node {
    int val;

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", >>>'" + inhalt + '\'' +
                '}';
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int val, String inhalt) {
        this.val = val;
        this.inhalt = inhalt;
    }

    public Node(int val, String inhalt, Node next) {
        this.val = val;
        this.inhalt = inhalt;
        this.next = next;
    }

    String inhalt;
    Node next;
}
