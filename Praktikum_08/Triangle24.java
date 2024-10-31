package Praktikum_08;
import java.util.*;

public class Triangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan Nilai n =");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }   
}
