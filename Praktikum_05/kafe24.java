import java.util.Scanner;
/**
 * kafe24
 */
public class kafe24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.print("Masukan Menu: ");
        menu = sc.nextLine();
        System.out.print("Masukan Ukuran Cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukan Jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukan keanggoraan (true/false): ");
        keanggotaan =sc.nextBoolean();
        double hargaMenu = 0;
        switch (menu.toLowerCase()){
            case "kopi":
            hargaMenu = 12000;
            break;
            case "teh" :
            hargaMenu = 7000;
            break;
            case "cokolat":
            hargaMenu = 20000;
            break;
        }
        double totalHarga = hargaMenu * jumlah;
        switch (ukuranCup) {
            case 'S':
            break;                
            case 'M':
            totalHarga += 0.25 * totalHarga ;
            break;
            case 'L':
            totalHarga += 0.4* totalHarga;
            break;
            default:
            System.out.println("Size yang dipilih tidak Tersedia.");
            return;
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        
        System.out.println("Item Pembelian: " + jumlah + ", " + menu + " dengan ukuran cup "+ ukuranCup );
        System.out.println("Nominal Bayar: "+ nominalBayar );

    }
}