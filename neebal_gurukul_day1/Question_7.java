import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 digits number");
        // int digits = sc.nextInt();
        int digits = 2050;
        int hours = digits / 100;
        int hours_In_12_hours = hours / 2;

        int minutes_In_12_hours = hours / 2;
        System.out.println(hours_In_12_hours + ":" + minutes_In_12_hours);

    }
}
