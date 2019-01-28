package com.company;

public class List<S> {

    public List(Node head) {
        this.head = head;
    }

    public List() {
    }

    @Override
    public String toString() {
        StringBuilder aussi = new StringBuilder();
        aussi.append("List{ head = \n" + head);
        Node p = head.next;
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

    Node head = null;
    Node tail = null;

    void hintenanhängen(int val, String text) {
        Node p = new Node(val, text);
        if (head == null) {
            head = p;
        } else {
            tail.next = p;
        }
        tail = p;
    }

    void vornanhängen(int val, String text) {
        Node p = new Node(val, text);
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

    Node maximalwertsuche() {
        if (head == null) {
            return head;
        }
        Node p = head;
        Node q = new Node(0, "sucher");
        while (p.next != null) {
            if (p.val > q.val) {
                q = p;
            }
            p = p.next;
        }
        return q;
    }

    void ordnen() {
        if (head == null) {
            return;
        }
        Node p = head.next;
        Node q = head;
        if (head.val > p.val) {
            q.next = p.next;
            head = p;
            head.next = q;
        }
        while (p.next != null) {
            Node prev = p; //1 3
            p = p.next;  //p ==2
            if (p.val > p.next.val) {
                p.next.next = p; //-1 zeigt auf 2
                prev.next = p.next.next;
                p.next = p.next.next;
                p = p.next;
            }
        }
    }

    void umdrehen(int erster) {
        Node p = head;
        Node prev = head;
        while (p.val != erster && p.next != null) {
            prev = p;
            p = p.next;
        }
        Node temp = prev.next;
        Node temp2 = p.next.next;
        prev.next = p.next;
        p.next.next = temp;
        temp.next = temp2;
    }

    void ordnung() {
        Boolean geordnet = false;
        Node p = head.next;
        while (head.val > p.val) {
            head.next = p.next;
            p.next = head;
            head = p;
            p = head.next;
        }
        Node prev = head;
        p = head.next;
        while (geordnet == false) {
            geordnet = true;
            p = head;
            while (p != null && p.next != null) {
                if (p.val > p.next.val) { // ich will 0 und 1 vertauschen
                    geordnet = false;
                    Node temp = prev.next;
                    Node temp2 = p.next.next;
                    prev.next = p.next;
                    p.next.next = temp;
                    temp.next = temp2;
                }
                prev = p;
                p = p.next; // there is no p
                tail = p;
            }
        }
    }

    List invert() {
        Node x = head.next;
        Node aussi = tail;
        Node y = head;
        y.next = null;
        while (x.next != null) {
            y = new Node(x.val, x.inhalt, y);
            x = x.next;
        }
        aussi.next = y;
        return new List(aussi);
    }
}