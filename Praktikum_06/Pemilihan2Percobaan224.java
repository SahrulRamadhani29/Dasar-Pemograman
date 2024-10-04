import java.util.Scanner;
/**
 * Pemilihan2Percobaan224
 */
public class Pemilihan2Percobaan224 {

    public static void main(String[] args) {
        String menul, member;
        int jumlah_Beli, total_Bayar, pilihan_menu, harga;
        double diskon;
        Scanner sc = new Scanner (System.in);
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------");
        System.out.println("masukan angka dari menu yang dipilih =  ");
        pilihan_menu=sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/n) ? =");
        member = sc.nextLine();
        System.out.println("--------------------------");
        if (member.equalsIgnoreCase("y")){
            diskon = 0.10 ;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga=14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = "+harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
            total_Bayar = (int) (harga - (harga * diskon));
            System.out.println( "Total bayar setelah diskon = " + total_Bayar);
        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu==1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu==2){
                harga = 3000;
                System.out.println("Harga ice tea = "+ harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak Valid");
        }
            System.out.println("-------------------------");
    }
}