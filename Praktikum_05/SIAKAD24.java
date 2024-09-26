import java.util.Scanner;
/**
 * SIAKAD24
 */
public class SIAKAD24 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String nama, kelas;
        int nim;

        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan No Absen:");
        byte absen = sc.nextByte();
        System.out.print("Masukan Nilai Kuis: ");
        byte kuis = sc.nextByte();
        System.out.print("Masukan Nilai Tugas: ");
        byte tugas = sc.nextByte();
        System.out.print("Masukan Nilai Ujian: ");
        byte ujian = sc.nextByte();

        String nilaiHuruf, kualifikasi;
        double nilaiSetara;
        double nilaiAkhir = (kuis + tugas + ujian) / 3;
        if (nilaiAkhir >=85){ 
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 80){ 
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 73){ 
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 65){ 
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 60){ 
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 50){ 
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else { 
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan Nama" + nama + ", Nim: " + nim + ", Kelas: " + kelas + ", Nomor Absen: " + absen);
        System.out.println("Nilai Akhir:" + nilaiAkhir);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);

    }
}