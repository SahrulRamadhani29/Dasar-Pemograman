import java.util.Scanner;

public class hargabuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double totalHarga, diskon, totalBayar;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07; 
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else {
                diskon += 0.01; 
            }
        } else { 
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0; 
            }
        }
        totalHarga = jumlahBuku * 10000; 
        totalBayar = totalHarga - (totalHarga * diskon);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}
