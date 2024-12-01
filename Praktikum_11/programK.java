package Praktikum_11;

public class programK {
    // Fungsi untuk mencetak angka dari 1 hingga i
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) { // Loop untuk mencetak angka
            System.out.println(j);
        }
        System.out.println(); // Tambahkan baris kosong
    }

    // Fungsi untuk menghitung penjumlahan dua bilangan
    public static int Jumlah(int bil1, int bil2) {
        return bil1 + bil2; // Mengembalikan hasil penjumlahan
    }

    // Fungsi untuk memanggil fungsi Jumlah dan TampilHinggaKei
    public static void TampilJumlah(int bil1, int bil2) {
        int hasilJumlah = Jumlah(bil1, bil2); // Hitung jumlah bil1 dan bil2
        TampilHinggaKei(hasilJumlah); // Tampilkan angka 1 hingga hasil jumlah
    }

    // Fungsi utama
    public static void main(String[] args) {
        int temp = Jumlah(1, 1); // Menghitung 1 + 1, hasilnya adalah 2
        TampilJumlah(temp, 5); // Panggil fungsi TampilJumlah dengan argumen 2 dan 5
    }
}
