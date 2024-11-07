package Praktikum_09;

import java.util.Scanner;

public class kafemenusoal3 {
    public static void main(String[] args) {

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner input = new Scanner(System.in);
        System.out.println("Menu yang Tersedia saat ini : Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice.");
        for (;;){
        System.out.print("Masukkan nama makanan yang ingin di beli: ");
        String makananDicari = input.nextLine();
        boolean ada = false; 
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ada = true; 
                break; 
            }
        } 
        if (ada) {
            System.out.println( "Menu " + makananDicari + " Tersedia. ");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
            break;
        }
    }
    }
}

