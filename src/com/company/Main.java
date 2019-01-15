package com.company;

public class Main {

    public static void main(String[] args) {
        List liste = new List();
        System.out.println("liste.head" + liste.head);
        liste.hintenanhängen(1);
        liste.hintenanhängen(2);
        liste.hintenanhängen(3);
        liste.hintenanhängen(4);
        liste.hintenanhängen(5);
        liste.hintenanhängen(6);
        liste.hintenanhängen(7);
        liste.hintenanhängen(8);
        List leer = new List();
        System.out.println(liste.suchen(5));
        liste.delete(4);
        System.out.println("3 " + liste.suchen(3));
        System.out.println("4 " + liste.suchen(4));
        System.out.println("5 " + liste.suchen(5));
        System.out.println("liste.head" + liste.head);
        liste.delete(1);
        System.out.println("liste.head" + liste.head);
    }
}
