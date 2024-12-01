package Praktikum_11;

import java.util.Scanner;

public class kafe24a {

    public static void main(String[] args) {
        int[][] penjualan = new int[5][7];
        Scanner scanner = new Scanner(System.in);

        inputPenjualan(penjualan, scanner);

        menu(penjualan);
        System.out.println("=============================");
        hari(penjualan);
        menuTop(penjualan);
        rata(penjualan);
    }

    public static void inputPenjualan(int[][] penjualan, Scanner scanner) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk " + menu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void menu(int[][] penjualan) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void hari(int[][] penjualan) {
        for (int i = 0; i < penjualan[0].length; i++) {
            System.out.print("Hari ke-" + (i + 1) + ": ");
            for (int j = 0; j < penjualan.length; j++) {
                System.out.print(penjualan[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void menuTop(int[][] penjualan) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int max = 0;
        String topMenu = "";
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > max) {
                max = total;
                topMenu = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + topMenu + " dengan total penjualan " + max);
    }

    public static void rata(int[][] penjualan) {
        String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double avg = (double) total / penjualan[i].length;
            System.out.printf(menu[i] + ": %.2f\n", avg);
        }
    }
}
