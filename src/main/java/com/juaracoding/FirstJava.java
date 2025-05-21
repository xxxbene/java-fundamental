package com.juaracoding;

import java.util.Random;

public class FirstJava {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String city = "Jakarta"; // city itu variable

        if (true){
            System.out.println(city);
            System.out.println("Statement IF");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(city);
            System.out.println(i);
        }

        Random random = new Random();

    }
}