package Praktikum_11;
import java.util.*;
public class Percobaan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukan Panjang: ");
        p=input.nextInt();  
        System.out.println("Masukan lebar: ");
        l=input.nextInt();
        System.out.println("Masukan Tinggi: ");
        t=input.nextInt();
        
        L=hitungluas(p, l);
        System.out.println("Luas Persegi Panjang adalah: " + L);
        vol= hitungVolume(t, p, l);
        System.out.println("Volume Balok Adalah: " + vol);
    }

    static int hitungluas (int pjg, int lb){
        int luas = pjg*lb;
        return luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungluas(a,b) * tinggi;
        return volume;
    }
    
}
