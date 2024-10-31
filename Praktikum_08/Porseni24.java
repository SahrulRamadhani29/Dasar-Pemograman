package Praktikum_08;

import java.util.Scanner;

public class Porseni24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahCabor = cabangOlahraga.length;
        int jumlahAtlet = 5;
        String[][] atletArray = new String[jumlahCabor][jumlahAtlet];

        for (int cabor = 0; cabor < jumlahCabor; cabor++) {
            System.out.println("Masukkan nama 5 atlet untuk cabang " + cabangOlahraga[cabor] + ":");
            for (int atlet = 0; atlet < jumlahAtlet; atlet++) {
                System.out.print("Atlet " + (atlet + 1) + ": ");
                atletArray[cabor][atlet] = sc.nextLine();
            }
        }

        System.out.println("\nDaftar atlet yang mendaftar di Porseni 2024:");
        for (int cabor = 0; cabor < jumlahCabor; cabor++) {
            System.out.println("Cabang " + cabangOlahraga[cabor] + ":");
            for (int atlet = 0; atlet < jumlahAtlet; atlet++) {
                System.out.println( (atlet + 1) + ". " + atletArray[cabor][atlet]);
            }
        }
    }
}

