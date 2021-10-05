package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();
        System.out.println("input = " + input);

        int input2 = userInput.nextInt();
        System.out.println("input2 = " + input2);

        // contoh menghitung luas persegi panjang
        int panjang,lebar,luas,tinggi,volume;
        System.out.println("==== Luas Persegi Panjang ====");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = (panjang * lebar);
        System.out.println("Nilai Luas = " + luas);

        System.out.println("==== Volume ====");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();

        volume = (luas * tinggi);
        System.out.print("Volume = " + volume);






    }
}
