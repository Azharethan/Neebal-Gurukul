import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of angle: ");
        // convert the value of angle in radiun bcoz it accepts angle in radian
        double x = sc.nextDouble();
        x = Math.toRadians(x);

        int n = 10;
        double fact = 1;
        double sum = 1;
        double num = 1;
        for (double i = 1; i < n; i++) {
            fact = fact * i;
            if (i % 2 == 0) {
                num = -num * x * x;
                sum = sum + (num / fact);
            }
        }
        System.out.println(sum);

    }
}
