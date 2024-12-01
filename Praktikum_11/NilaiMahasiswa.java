package Praktikum_11;

import java.util.Scanner;

public class NilaiMahasiswa {
    // Array untuk menyimpan nama mahasiswa dan nilai mereka selama 7 minggu
    static String[] mahasiswa = {"Budi", "Ani", "Siti", "Dono", "Tina"};
    static int[][] nilai = new int[5][7];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Memasukkan nilai mahasiswa
        masukkanNilai(scanner);

        // 2. Menampilkan semua nilai mahasiswa
        tampilkanSemuaNilai();

        // 3. Mencari minggu dengan nilai tertinggi
        cariMingguDenganNilaiTertinggi();

        // 4. Mencari mahasiswa dengan nilai tertinggi dan menampilkan minggunya
        cariMahasiswaDenganNilaiTertinggi();
        
        scanner.close();
    }

    // Fungsi untuk memasukkan nilai untuk setiap mahasiswa
    public static void masukkanNilai(Scanner scanner) {
        System.out.println("Masukkan nilai untuk setiap mahasiswa:");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nilai untuk " + mahasiswa[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan semua nilai mahasiswa dari minggu 1 sampai 7
    public static void tampilkanSemuaNilai() {
        System.out.println("\nNilai semua mahasiswa dari Minggu 1 sampai Minggu 7:");
        System.out.print("Mahasiswa\t");

        for (int minggu = 1; minggu <= 7; minggu++) {
            System.out.print("M" + minggu + "\t");
        }
        System.out.println();

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print(mahasiswa[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari minggu dengan total nilai tertinggi
    public static void cariMingguDenganNilaiTertinggi() {
        int nilaiTertinggi = Integer.MIN_VALUE;
        int mingguTertinggi = -1;

        for (int minggu = 0; minggu < 7; minggu++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                totalNilaiMinggu += nilai[i][minggu];
            }
            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = minggu + 1;
            }
        }

        System.out.println("\nMinggu dengan total nilai tertinggi adalah Minggu " + mingguTertinggi + " dengan nilai total " + nilaiTertinggi);
    }

    // Fungsi untuk mencari mahasiswa dengan nilai tertinggi dan menampilkan minggu di mana nilai tersebut dicapai
    public static void cariMahasiswaDenganNilaiTertinggi() {
        int nilaiTertinggi = Integer.MIN_VALUE;
        String mahasiswaTerbaik = "";
        int mingguTerbaik = -1;

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int minggu = 0; minggu < 7; minggu++) {
                if (nilai[i][minggu] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][minggu];
                    mahasiswaTerbaik = mahasiswa[i];
                    mingguTerbaik = minggu + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + mahasiswaTerbaik + " dengan nilai " + nilaiTertinggi + " pada Minggu " + mingguTerbaik);
    }
}
