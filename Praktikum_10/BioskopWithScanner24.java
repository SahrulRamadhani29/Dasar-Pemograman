package Praktikum_10;
import java.util.*;
public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    String nama, next;
    int baris, kolom;

    String [] [] penonton = new String [4][2];
    while (true) {
        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukan Baris: ");
        baris = input.nextInt();
        System.out.print("Masukan Kolom: ");
        kolom = input.nextInt();
        input.nextLine();

        penonton [baris-1][kolom-1]=nama;

        System.out.print("Input penonton lainya? (y/n): ");
        next = input.nextLine();

        if (next.equalsIgnoreCase("n")){
            break;
        }
    }
    }
}
