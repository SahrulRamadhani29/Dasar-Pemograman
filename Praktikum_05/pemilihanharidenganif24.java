import java.util.Scanner;

public class pemilihanharidenganif24 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte dayNumber;
        String dayType;

        System.out.println("Input day number (1-7):");
        dayNumber = sc.nextByte();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println("Day number " + dayNumber + " is a " + dayType);
    }
}
