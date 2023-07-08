package org.example.zad2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad2 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true){
            System.out.println("Type name to names database");
            name = scanner.next();
            if(name.equals("-")){
                break;
            }
            name = name.substring(0,1).toUpperCase()
                    .concat(name.substring(1).toLowerCase());
            names.add(name);
        }
        names.forEach(System.out::println);
    }
}
