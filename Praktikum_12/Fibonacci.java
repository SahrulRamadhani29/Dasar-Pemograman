package Praktikum_12;

public class Fibonacci {

    static int pasanganProduktif(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return pasanganProduktif(n - 1) + pasanganProduktif(n - 2);
        }
    }

    static int pasanganTidakProduktif(int n) {
        if (n == 1 || n == 2) {
            return 0;
        } else {
            return pasanganProduktif(n - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;

        System.out.println("Bulan\tPasangan Produktif\tPasangan Tidak Produktif\tJumlah Pasangan");
        for (int i = 1; i <= bulan; i++) {
            int produktif = pasanganProduktif(i);
            int tidakProduktif = pasanganTidakProduktif(i);
            int total = produktif + tidakProduktif;

            System.out.println(i + "\t" + produktif + "\t" + tidakProduktif + "\t" + total);
        }
    }
}
