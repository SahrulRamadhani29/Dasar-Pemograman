package Praktikum_05;
import java.util.Scanner;

public class pemilihanbilternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " merupakan Bilangan Genap" 
                                        : "Angka " + angka + " merupakan Bilangan Ganjil";
        System.out.println(hasil); 
    }
}
