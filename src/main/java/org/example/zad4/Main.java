package org.example.zad4;

public class Main {
    public static void main(String[] args) {
        Human wojtek = new Human("Wojtek", "Kesek");
        Human wojtek2 = new Human("Wojtek", "Kesek");
        System.out.println(wojtek.equals(wojtek2));

        HumanFix wojtekFix = new HumanFix("Wojtek", "Kesek", 1);
        HumanFix wojtekFix2 = new HumanFix("Wojtek", "Kesek", 2);

        System.out.println(wojtekFix.equals(wojtekFix2));
    }
}
