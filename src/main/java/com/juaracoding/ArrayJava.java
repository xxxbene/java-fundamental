package com.juaracoding;

import java.util.Scanner;

public class ArrayJava {

    public static void main(String[] args) {

        // cara 1 tidak bisa di lakukan scanner
        int[] nilai = {90,95,92,94,98};
        System.out.println(nilai[2]);
        System.out.println("Length = "+nilai.length);

        // cara 2 bisa pake scanner, inputan dari user
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        System.out.println(nums[4]);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }

        // foreach
        for (int num : nums){
            System.out.println(num);
        }

        String[] cities = {"Jakarta", "Bandung", "Cirebon", "Medan", "Surabaya"};
        String search = "Medan";
        boolean isFound = false;
        int index = 4;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(search)){
                isFound = true;
                index = i;
                break;
            }
        }  if (isFound){
            System.out.println(search+" ditemukan pada index ke-"+index);
        } else {
            System.out.println(search+" tidak ditemukan dalam daftar kota.");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah barang: ");
        int length = scanner.nextInt();
        double[] prices = new double[length];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Masukan harga ke-"+(i+1)+" = ");
            prices[i] = scanner.nextDouble();
        }
        // total harga
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        System.out.println("Total harga: " + total);
        System.out.println("Rata - rata harga: " + total/ prices.length);


        // array multidimensi
        int [][] numbers = {{1,2,3,4},{5,6,7}};
        System.out.println(numbers[1][2]);
        System.out.println(numbers[0][3]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Baris ke-"+(i+1));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

    }
}
