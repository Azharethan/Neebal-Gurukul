import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lower bound: ");
        int lb = sc.nextInt();
        System.out.print("enter higher bound: ");
        int hb = sc.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i <= hb; i++) {
            int c = a + b;
            if (c >= lb & c <= hb) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;

        }
    }
}
