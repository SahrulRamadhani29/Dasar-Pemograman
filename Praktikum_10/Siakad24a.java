package Praktikum_10;
import java.util.*;

public class Siakad24a {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int nilai [][] = new int [4][3];
    for (int i=0; i< nilai.length; i++) {
        System.out.println("Input nilai Mahasiswa ke-" + (i+1));
        double totalPersiswa = 0;
        for (int j= 0 ; j<nilai[i].length ; j++){
            System.out.print("Nilai Mata Kuliah " + (j+1) + ": ");
            nilai[i][j]= input.nextInt();
            totalPersiswa+= nilai[i][j];
        } 
        System.out.println("Nilai rata-rata: " + totalPersiswa/3);
    }
    }
}
