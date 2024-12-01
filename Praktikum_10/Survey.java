package Praktikum_10;

import java.util.*;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah responden: ");
        int jmlRspn = input.nextInt();
        System.out.print("Masukkan jumlah pertanyaan: ");
        int jmltanya = input.nextInt();

        int survey [][] = new int[jmlRspn][jmltanya];

        System.out.println("Masukkan nilai survei (1-5) untuk masing-masing responden dan pertanyaan:");
        for (int i = 0; i < jmlRspn; i++) {
            for (int j = 0; j < jmltanya; j++) {
                System.out.printf("Responden %d, Pertanyaan %d: ", i + 1, j + 1);
                survey[i][j] = input.nextInt();
            }
        }
        System.out.println("\nRata-rata nilai setiap responden:");
        for (int i = 0; i < jmlRspn; i++) {
            int sumResponden = 0;
            for (int j = 0; j < jmltanya; j++) {
                sumResponden += survey[i][j];
            }
            double rataRspn = (double) sumResponden / jmltanya;
            System.out.printf("Responden %d: %.2f%n", i + 1, rataRspn);
        }
        System.out.println("\nRata-rata nilai setiap pertanyaan:");
        for (int j = 0; j < jmltanya; j++) {
            int sumPertanyaan = 0;
            for (int i = 0; i < jmlRspn; i++) {
                sumPertanyaan += survey[i][j];
            }
            double rataTanya = (double) sumPertanyaan / jmlRspn;
            System.out.printf("Pertanyaan %d: %.2f%n", j + 1, rataTanya);
        }
        int totalSum = 0;
        for (int i = 0; i < jmlRspn; i++) {
            for (int j = 0; j < jmltanya; j++) {
                totalSum += survey[i][j];
            }
        }
        double rataSemua = (double) totalSum / (jmlRspn * jmltanya);
        System.out.printf("\nRata-rata keseluruhan: %.2f%n", rataSemua);
    }
}
