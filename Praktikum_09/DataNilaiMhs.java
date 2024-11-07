package Praktikum_09;
import java.util.*;
import java.text.DecimalFormat;
public class DataNilaiMhs {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    double total=0;
    double rata=0;
    int terendah = 100, tertinggi = 0;
    DecimalFormat df = new DecimalFormat("#.##");

    System.out.print("Masukan Jumlah Mahasiswa = ");
    int jumlahMhs = input.nextInt();
    int nilaiMhs [] = new int [jumlahMhs];

    for (int i = 0 ; i<nilaiMhs.length; i++) {
        System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " :");
        nilaiMhs[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++ ) {
        if (nilaiMhs[i] < terendah) {
            terendah = nilaiMhs[i];
        }
        if (nilaiMhs[i] > tertinggi) {
            tertinggi = nilaiMhs[i];
        }
        total += nilaiMhs[i];
    }
    rata = total / jumlahMhs;
    System.out.println("==========================================================");
    System.out.println("Rata-rata nilai Lulus = "+ df.format(rata));
    System.out.println("Nilai tertinggi adalah = " + tertinggi + ", Nilai terendah Adalah = " + terendah);

    for (int i = 0 ; i<nilaiMhs.length; i++) {
        System.out.println("Nilai Mahasiswa ke-" + (i+1) + " Adalah : " + nilaiMhs[i] );
    }
    }
}
