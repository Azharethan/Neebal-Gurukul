import java.util.Scanner;

public class Question_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("enter third number: ");
        int num3 = sc.nextInt();

       int greatest1= num1>num2?num1:num2;
       int greatest2=greatest1>num3?greatest1:num3;
       System.out.println(greatest2);
    }
    
}