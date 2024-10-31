package Praktikum_09;
import java.util.*;
public class Ratanilaisoal {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double totalLulus=0, totalTdkLulus = 0;
    double rataLulus, ratatdkLulus;
    int lulus = 0, tdkLulus = 0;
    
    System.out.print("Masukan Jumlah Mahasiswa = ");
    int jumlahMhs = input.nextInt();
    int nilaiMhs [] = new int [jumlahMhs];

    for (int i = 0 ; i<nilaiMhs.length; i++) {
        System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " :");
        nilaiMhs[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++ ) {
        if (nilaiMhs[i]>70) {
            lulus ++;
            totalLulus += nilaiMhs [i];
        } else {
            tdkLulus++;
            totalTdkLulus += nilaiMhs [i];
        }
    }
    rataLulus = (lulus > 0) ? totalLulus / lulus : 0;
    ratatdkLulus = (tdkLulus > 0) ? totalTdkLulus / tdkLulus : 0;
    System.out.println("Rata-rata nilai Lulus = "+  rataLulus);
    System.out.println("Rata-rata nilai tidak Lulus = " + ratatdkLulus);
    }
}
