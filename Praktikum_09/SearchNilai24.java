package Praktikum_09;
import java.util.*;
public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int jmlMhs=0;
        int hasil=0, key=0;

        System.out.print("Masukan nilai yang akan di input : ");
        jmlMhs = input.nextInt();

        int nilai [] = new int [jmlMhs]; 
        for (int i=0; i<nilai.length; i++){
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " : " );
            nilai[i] = input.nextInt(); 
        }

        System.out.print("Masukan Nilai yang  ingin di cari : ");
        key = input.nextInt();
        for (int i=0; i<nilai.length; i++){
            if (key == nilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai " + key + " Adalah nilai Mahasiswa ke-" + hasil);
                System.out.println();
                break; 
            } else {
                System.out.println("Nilai yang dicari tidak di temukan. ");
                break;
            }
        }
    }
}
