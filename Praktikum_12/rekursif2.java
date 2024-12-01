package Praktikum_12;
import java.util.*;
public class rekursif2 {
    static String kali = "";

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            kali += "1";
            return 1;
        } else {
            kali += x + "x";
            return x * hitungPangkat(x, y - 1);
        }
    }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan: ");
        int bil = input.nextInt();

        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();

        kali = "";
        int hasil = hitungPangkat(bil, pangkat);
        System.out.println("Deret perhitungan: " + kali + " = " + hasil);
    }
}
