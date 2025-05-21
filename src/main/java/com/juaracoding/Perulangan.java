package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // 5 < (kurang dari) 5
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) { // 5 > (lebih besar dari) 0
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println("Ini adalah angka ganjil: " + i);
            }
        }
        System.out.println();
        System.out.println("====================================");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();

        int sisi = 10; // selama true akan looping terus bray
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        // ****
        // *****

        int n = 10;
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /*
        WHILE DO-WHILE
         */
        System.out.println();
        int x = 0;
        while (x < 5){
            System.out.print(x);
            x++;
        }
        System.out.println("\n------------");
        int y = 0;
        do {
            System.out.print(y);
            y++;
        } while (y < 5);

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // jika user input 0 maka looping break
        while (true){
            System.out.println("Masukan angka: ");
            int angka = scanner.nextInt();
            if (angka == 0) {
                break;
            }
        }

        boolean isAccountLocked = false;
        int count = 3;

        if (count == 3) {
            isAccountLocked = true;
        }

        System.out.println(isAccountLocked);


        int num = 0;
        int sum = 0;
        while (num < 10) {
            if (num % 2 == 1) {
                System.out.print(num);
                sum += num;
                if (num > 6) break;
            }
            num++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
