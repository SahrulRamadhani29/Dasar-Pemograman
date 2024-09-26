import java.util.Scanner;
public class pemilihanbilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " merupakan Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + " merupakan Bilangan Ganjil");
        }
    }
}
