import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a 4 digit number: ");
    int num = sc.nextInt();
    int firstHAlf=num/100;
    int secondHalf=num%100;
    System.out.println(secondHalf+""+firstHAlf);
    }
}
