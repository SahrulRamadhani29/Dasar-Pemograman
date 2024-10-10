import java.util.Scanner;

public class SiAkadFor24modify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        int batasKelulusan = 60;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= batasKelulusan) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa yang Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus: " + tidakLulus);
    }
}
