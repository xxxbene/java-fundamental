package com.juaracoding;

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        if (true) {
            System.out.println("Statement");
        }
        System.out.println("Next Statement");

        if (false) {
            System.out.println("Statement True");
        } else {
            System.out.println("Statement False");
        }

        int num = 125; // pake modulus sisa bagi hasil dan perbandingan
        if (num % 2 == 0) {
            System.out.println(num + " adalah bilangan genap");
        } else {
            System.out.println(num + " adalah bilangan ganjil");
        }


        Scanner input = new Scanner(System.in);
        int stock = 226;
        double price = 1999000;

        System.out.println("_======Redmi Pad======_");
        System.out.println("Membeli berapa unit?: ");
        int quantity = input.nextInt();

        if (quantity < 1) {
            System.out.println("ERROR! Jumlah pembelian tidak boleh kurang dari 1");
        } else if (quantity > stock) {
            System.out.println("ERROR! Jumlah pembelian melebihi stock barang!");
        } else {
            double totalPrice = quantity * price;
            System.out.println("\n===============");
            System.out.println("Pembelian berhasil!");
            System.out.println("Jumlah: " + quantity);
            System.out.println("Total harga: Rp " + totalPrice);
        }





    }
}
