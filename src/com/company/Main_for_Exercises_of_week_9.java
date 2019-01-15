package com.company;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main_for_Exercises_of_week_9 {
    public static void main(String[] args) {
//        List<Integer> liste = IntStream.range(1,20).collect(Collectors.toList());

        System.out.println("Alle");
        IntStream.range(1, 20)
                .forEach(e -> System.out.println(e));

        System.out.println("Alle Geraden");
        IntStream.range(1, 20)
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        System.out.println("Alle Ungeraden");
        IntStream.range(1, 20)
                .filter(e -> e % 2 != 0)
                .forEach(e -> System.out.println(e));

        System.out.println("Alle, die durch 3 teilbar sind und größer als 10");
        IntStream.range(1, 20)
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .forEach(e -> System.out.println(e));

        System.out.println("Das Dreifache aller Zahlen, die kleiner als 5 sind");
        IntStream.range(1, 5)
                .map(e -> e * 3)
                .forEach(e -> System.out.println(e));

        System.out.println("Zahlen zwischen 8 und 12");
        IntStream.range(8, 12)
                .forEach(e -> System.out.println("number " + String.valueOf(e).length() + " has three digits"));
    }
}
