package com.company;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.util.stream.Collectors;

public class Exercise_2_StreamsTest {
    public FileReader fileReade = new FileReader();
    private List<String> getNames = (List<String>) fileReade.asList("com/company/names.txt");

    List noMoreThanFour(){
        List<String> names = getNames.stream()
                .filter(e -> e.length() < 5)
                .collect(Collectors.toList());
        return names;
    }


}
