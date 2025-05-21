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

// IF ELSE
        Scanner input = new Scanner(System.in);
        int stock = 226;
        double price = 1999000;
        System.out.println("_======Redmi Pad======_");
        System.out.print("Membeli berapa unit?: ");
        int quantity = input.nextInt();
        input.nextLine(); // Buang newline setelah nextInt()

        if (quantity < 1) {
            System.out.println("ERROR! Jumlah pembelian tidak boleh kurang dari 1");
        } else if (quantity > stock) {
            System.out.println("ERROR! Jumlah pembelian melebihi stock barang!");
        } else {
            // Input status pembeli
            System.out.print("Apakah Anda first buyer? (y/n): ");
            String firstBuyerInput = input.nextLine();
            boolean isFirstBuyer = firstBuyerInput.equalsIgnoreCase("y");

            System.out.print("Apakah Anda member? (y/n): ");
            String memberInput = input.nextLine();
            boolean isMember = memberInput.equalsIgnoreCase("y");

            System.out.print("Apakah Anda punya voucher? (y/n): ");
            String voucherInput = input.nextLine();
            boolean hasVoucher = voucherInput.equalsIgnoreCase("y");

            double totalPrice = quantity * price;
            double discount = 0.0;

//        NESTED IF (ADA IF DI DALAM IF)
        /*
        discount><
        member: 5%
        first buyer: 10%
        voucher: 7%
        !member, !firstbuyer, !voucher = normal price
         */
            if (isFirstBuyer) {
                discount += 0.10;
                if (hasVoucher) {
                    discount += 0.07;
                }
            } else {
                if (isMember) {
                    discount += 0.05;
                }
                if (hasVoucher) {
                    discount += 0.07;
                }
            }

            double finalPrice = totalPrice - (totalPrice * discount);

            System.out.println("\n===============");
            System.out.println("Pembelian berhasil!");
            System.out.println("Jumlah: " + quantity);
            System.out.println("Total harga sebelum diskon: Rp " + totalPrice);
            System.out.println("Total diskon: " + (discount * 100) + "%");
            System.out.println("Total harga setelah diskon: Rp " + finalPrice);
        }

        input.close();

    }
}