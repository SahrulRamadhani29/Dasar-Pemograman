package Praktikum_10;
import java.util.*;

public class Siakad24c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMhs = input.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = input.nextInt();
        
        int nilai[][] = new int[jmlMhs][jmlMatkul];
        
        for (int i = 0; i < jmlMhs ; i++) {
            System.out.println("Input nilai Mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.printf("Nilai rata-rata: %.2f\n " , totalPerSiswa / jmlMatkul);
        }
        
        System.out.println("\n======================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah:");
        
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < jmlMhs; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.printf("Mata kuliah " + (j + 1) + ": %.2f\n" ,  totalPerMataKuliah / jmlMhs);
        }
    }
}
