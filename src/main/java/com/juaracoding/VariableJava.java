package com.juaracoding;

import java.awt.*;
import java.util.Scanner;

public class VariableJava {

    public static void main(String[] args) {

        String productName = "Hardcase";
        int price = 70000;
        float priceFloat = 70000.357f;

        System.out.println(productName);
        System.out.println(price);
        System.out.println(priceFloat);


        short stock = 999; // stock maksimal biasanya pada ecommerce 999
        long productId = 89898989898989L;
        char grade = 'A';
        String pathImage = "D://Pictures//avatar.png";
        System.out.println(pathImage);
        System.out.println(stock);
        System.out.println(productId);
        System.out.println(grade);

        /*
        Pembahasan Variable Java
        JuaraCoding BootCamp
         */

        boolean isStock = false;
        boolean isValidationEmail = true;
        // stock ada, apapun ada itu true, kalau ga ada itu false
        /*
        mengarah ke pertanyaan pake is yaa
         */

        Scanner scanner = new Scanner(System.in);

        String pathImageAccount = "";
        System.out.print("Masukan Nama Lengkap: ");
        String fullName = scanner.nextLine();
        String userName = "";
        int userID = 6908769;
        String email = "";
        String phoneNumber = "";
        char gender = 'M';
        String dob = "yyyy-mm-dd";
        boolean isActive = true;

        System.out.println("Nama Lengkap: "+ fullName);
        System.out.printf("Harga: %.2f\n", priceFloat);
        System.out.println("----------");


        // Automatic Casting - Implicit
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        char data2 = 'Z'; // Z sama z beda ya hasilnya, dapet dari table ascii
        long dataLong = data2;
        System.out.println(dataLong);

        // Manual Casting - Explicit
        long data3 = 2200000000L;
        int dataInt = (int) data3;
        System.out.println(dataInt);

        // Passing by Value
        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;

        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80, 90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());



    }
}
