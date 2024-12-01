package Praktikum_12;

public class CekPrimaRekursif {

    static boolean cek(int n, int bil) {
        if (bil * bil > n) {
            return true;
        }
        if (n % bil == 0) {
            return false;
        }
        return cek(n, bil + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima.");
        } else if (cek(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
