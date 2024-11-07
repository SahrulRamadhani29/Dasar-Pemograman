package Praktikum_10;
import java.util.*;

public class BioskopWithScannerSoal24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("==================================");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukan Nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukan Baris (1-4): ");
                    baris = input.nextInt();
                    System.out.print("Masukan Kolom (1-2): ");
                    kolom = input.nextInt();
                    input.nextLine(); 

                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris atau kolom tidak valid, coba lagi.");
                    } else{
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penonton " + nama + " berhasil masuk di baris " + baris + ", kolom " + kolom);
                            break;
                        }
                    }
                }
            } 
            else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } 
            else if (menu == 3) {
                System.out.println("Program selesai.");
                break;
            } 
            else {
                System.out.println("Pilihan menu tidak valid. Coba lagi.");
            }
        }
    }
}

