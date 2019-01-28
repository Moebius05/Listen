package com.company;

public class Verkettete_Liste {

    @Override
    public String toString() {
        StringBuilder aussi = new StringBuilder();
        aussi.append("List{ head = \n" + head);
        Node_für_Kette p = head.next;
        while (p.next != null) {
            aussi.append("\n");
            aussi.append(p.toString());
            p = p.next;
        }
        aussi.append("\n");
        aussi.append(p.toString());
        aussi.append('}');
        return aussi.toString();

    }

    Node_für_Kette head = null;
    Node_für_Kette tail = head;

    void am_Ende_dran(int val) {
        Node_für_Kette eini = new Node_für_Kette(val);
        Node_für_Kette prev;
        if (head == null) {
            System.out.println(val);
            head = new Node_für_Kette(val);
        }
        if (head.next == null) {
            head.next = eini;
            eini.prev = head;
            tail = eini;
        } else {
            Node_für_Kette p = head.next;
            while (p.next != null) {
                prev = p;
                p = p.next;
            }
            p.next = eini;
            eini.prev = p;
        }
    }
}
