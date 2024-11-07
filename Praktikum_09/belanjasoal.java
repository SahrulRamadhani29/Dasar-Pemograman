package Praktikum_09;

import java.util.Scanner;

public class belanjasoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBiaya = 0;
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();
        
        String namaPesanan [] = new String[jumlahPesanan];
        double hargaPesanan [] = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine();
        }
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }
        System.out.println("=====================================");
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " = Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);

    }
}
