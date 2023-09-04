import java.util.Scanner;

public class Question_6 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter 3 digit number: ");
    int num =sc.nextInt();
    int d1=153/100;
    int d2=(num/10)%10;
    int d3=num%10;
 
    if(d1*d1*d1+d2*d2*d2+d3*d3*d3==num){
        System.out.println(num+" is an Armstrong Number");
    } else {
        System.out.println(num+" is not an Armstrong Number");
    }

   } 
}
