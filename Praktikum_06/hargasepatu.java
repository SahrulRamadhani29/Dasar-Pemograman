import java.util.Scanner;

public class hargasepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merek, kategori;
        int ukuran;
        int harga = 0;

        System.out.print("Masukkan merek sepatu (Specs/910/Ortus): ");
        merek = sc.nextLine();
        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        kategori = sc.nextLine();
        System.out.print("Masukkan ukuran sepatu (36-44): ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                }
            } else if (kategori.equalsIgnoreCase("High Top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek Specs. Pilih antara Slip On atau High Top.");
                sc.close();
            }
        }

        else if (merek.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek 910. Pilih antara Woman atau Man.");
                sc.close();
                return;
            }
        }

        else if (merek.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek Ortus. Pilih antara Kids atau Adult.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Merek tidak valid. Pilih antara Specs, 910, atau Ortus.");
            sc.close();
            return; 
        }

        if (harga != 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Tidak ada harga yang sesuai dengan input yang diberikan.");
        }

        sc.close();
    }
}
