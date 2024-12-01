package Praktikum_11;

import java.util.Scanner;

public class kubus24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double s = sc.nextDouble();
        
        double v = hitungVolume(s);
        double l = hitungLuas(s);
        
        System.out.println("Volume Kubus: " + v);
        System.out.println("Luas Permukaan Kubus: " + l);
    }
    
    public static double hitungVolume(double s) {
        return s * s * s;
    }
    
    public static double hitungLuas(double s) {
        return 6 * s * s;
    }
}

