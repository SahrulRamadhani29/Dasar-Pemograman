import java.util.*;

/**
 * uts24
 */
public class uts24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input, detik, menit=0, jam=0;
        
        for (;;){
            System.out.print("Masukan Berapa detik = ");
            input = sc.nextInt();
            if (input<0){
                break;
            }
        detik = input % 60;
        menit = input / 60 % 60;
        jam = input / 3600 % 3600;
        System.out.println( jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        }
    }
}
