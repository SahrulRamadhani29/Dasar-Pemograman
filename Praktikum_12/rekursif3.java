package Praktikum_12;

import java.util.*;
public class rekursif3 {
    
    static double hitungLaba (double saldo, int tahun) {
        if (tahun==0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Jumlah Saldo Awal: ");
        double saldoAwal = input.nextInt();
        System.out.print("Lamanya Investasi (Tahun): ");
        int tahun = input.nextInt();

        System.out.print("Jumlah Saldo Setelah " + tahun + " tahun: ");
        System.out.print(hitungLaba(saldoAwal, tahun));
}
}