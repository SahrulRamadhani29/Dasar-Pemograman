package Praktikum_11;

import java.util.Scanner;

public class kafe24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = scanner.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();

        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(penjualan, jumlahMenu, jumlahHari, scanner);

        menu(penjualan, jumlahMenu, jumlahHari);
        System.out.println("=============================");
        hari(penjualan, jumlahMenu, jumlahHari);
        menuTop(penjualan, jumlahMenu, jumlahHari);
        rata(penjualan, jumlahMenu, jumlahHari);
    }

    public static void inputPenjualan(int[][] penjualan, int jumlahMenu, int jumlahHari, Scanner scanner) {
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + (i + 1) + ":");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void menu(int[][] penjualan, int jumlahMenu, int jumlahHari) {
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void hari(int[][] penjualan, int jumlahMenu, int jumlahHari) {
        for (int i = 0; i < jumlahHari; i++) {
            System.out.print("Hari ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahMenu; j++) {
                System.out.print(penjualan[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void menuTop(int[][] penjualan, int jumlahMenu, int jumlahHari) {
        int max = 0;
        String topMenu = "";
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                topMenu = "Menu " + (i + 1);
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + topMenu + " dengan total penjualan " + max);
    }

    public static void rata(int[][] penjualan, int jumlahMenu, int jumlahHari) {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double avg = (double) total / jumlahHari;
            System.out.printf("Menu " + (i + 1) + ": %.2f\n", avg);
        }
    }
}
