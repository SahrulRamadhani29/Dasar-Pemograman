package Praktikum_12;

import java.util.*;

public class DeretDescending {
    static void descendingRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        descendingRekursif(n - 1);
    }

    static void descendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.println("\nHasil dengan fungsi rekursif:");
        descendingRekursif(n);

        System.out.println("\nHasil dengan fungsi iteratif:");
        descendingIteratif(n);
    }
}
