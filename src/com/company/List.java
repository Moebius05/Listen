package com.company;

public class List {
    Node head = null;
    Node tail = null;

    void hintenanhängen(int val) {
        Node p = new Node(val);
        if (head == null) {
            head = p;
        } else {
            tail.next = p;
        }
        tail = p;
    }

    void vornanhängen(int val) {
        Node p = new Node(val);
        p.next = head;
        head = p;

    }

    int suchen(int gesuchterWert) {
        if (head == null) {
            return -1;
        }
        Node n = head;
        while ((n.val != gesuchterWert) && (n.next != null)) {
            n = n.next;
        }
        if (n.val == gesuchterWert) {
            return n.val;
        } else {
            return -1;
        }
    }

    void delete(int zu_löschender_Wert) {
        if (head.val == zu_löschender_Wert) {
            head = head.next;
            return;
        }
        Node n = head;
        Node prev = null;
        while ((n.val != zu_löschender_Wert) && (n.next != null)) {
            prev = n;
            n = n.next;
        }
        prev.next = n.next;
    }
}