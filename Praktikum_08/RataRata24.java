package Praktikum_08;
import java.util.*;

public class RataRata24 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int nilaiMhs;
    int i = 1;
    System.out.println("Input Nilai Mahasiswa Ke-" + i );
    while (i<=5) {
        int totalNilai=0;
        for(int j=1; j<= 5 ; j++){
            System.out.print("Nilai ke-" + j + " = ");
            nilaiMhs = sc.nextInt();
            totalNilai += nilaiMhs;
        }
        int rataNilai=totalNilai/5;
        i++;
        System.out.println("Rata Rata Nilai Mahasiswa ke " + i + " Adalah " + rataNilai);
    }
   } 
}
