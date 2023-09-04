import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter miliSeconds: ");
        int milisecond = sc.nextInt();
        int hours= milisecond/3600000;
        int remainingMiliSecond=milisecond%3600000;
        int minutes= remainingMiliSecond/60000;
        int remainingMilisecond1=remainingMiliSecond%60000;
        int second=remainingMilisecond1/1000;
        System.out.println(hours+":"+minutes+":"+second);
    }
}
