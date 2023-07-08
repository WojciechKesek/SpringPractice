package org.example.zad3;

import java.util.Arrays;
import java.util.List;

public class Zad3 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,3,4,10,9,13,6);
        num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*100)
                .forEach(System.out::println);
    }
}
