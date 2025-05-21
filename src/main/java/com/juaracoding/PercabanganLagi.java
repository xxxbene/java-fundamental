package com.juaracoding;

public class PercabanganLagi {
    public static void main(String[] args) {

        String username = "admin";
        String inputUsername = "admin";
        String password = "indonesia";
        String inPassword = "Indonesia";

        boolean isValid = password.equals(inPassword.toLowerCase());
        System.out.println(isValid);
        if (username.equalsIgnoreCase(inputUsername) && password.equalsIgnoreCase(inPassword)){
            System.out.println("Login berhasil!");
            System.out.println("Menampilkan halaman dashboard");
        } else {
            System.out.println("Invalid login");
            System.out.println("Return login page");
        }


        String text = "Jakarta never sleeps";
        boolean isContains = text.contains("sle");
        System.out.println(isContains);

        /*
        SWITCH CASE
         */

        int option = 1; // CRUD
        switch (option){
            case 1:
                System.out.println("Menampilkan semua data");
                break;
            case 2:
                System.out.println("Menampilkan data berdasarkan ID");
                break;
            case 3:
                System.out.println("Input data");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        int grade = 72;
        String statement = grade >= 75 ? "Selamat anda lulus!" : "Anda belum melampaui minimum nilai!";
        System.out.println(statement);

    }
}
