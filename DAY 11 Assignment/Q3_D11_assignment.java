import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_D11_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        try {
            System.out.print("enter first integer: ");
            num1=sc.nextInt();

            System.out.print("enter second integer: ");
            num2=sc.nextInt();

            int sum =num1+num2;
            System.out.println("your sum is: "+sum);
            
        } catch (InputMismatchException e) {
            System.out.println("invalid inputs!please enter integer "+e);
        }
    }
}
