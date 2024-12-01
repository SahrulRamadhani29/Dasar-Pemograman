package Praktikum_12;

public class penjumlahanRekursif {

    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1 ");
            return 1;
        } else {
            System.out.print(n + " + ");
            return n + hitungPenjumlahan(n - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8;
        System.out.print("Proses Penjumlahan: ");
        int hasil = hitungPenjumlahan(f);
        System.out.println("= " + hasil);
    }
}
