package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> liste = new List<String>();
        System.out.println("liste.head" + liste.head);
        liste.hintenanhängen(1, "eins");
        liste.hintenanhängen(2, "zwei");
        liste.hintenanhängen(3, "drei");
        liste.hintenanhängen(4, "vier");
        liste.hintenanhängen(15, "fünfzehn");
        liste.hintenanhängen(6, "sechs");
        liste.hintenanhängen(7, "sieben");
        liste.hintenanhängen(8, "acht");
        liste.hintenanhängen(9, "neun");
        liste.hintenanhängen(10, "zehn");
        liste.hintenanhängen(5, "fünf");
        System.out.println(liste.toString());
        liste.vornanhängen(27, "siebenundzwanzig");
        liste.ordnung();
        System.out.println(liste.toString());
        System.out.println(".........");
        System.out.println(liste);
        System.out.println("und jetzt verkehrt");
        List umdrht = liste.invert();
        System.out.println(umdrht.toString());
    }
}
