import java.util.Scanner;

public class Q1_D9_assignment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the sentence: ");
        String s=sc.nextLine();
        String[] s2=s.split(" ");
        for (int i = 0; i < s2.length; i++) {
             System.out.print(s2[i]);
        }
       
    }
}
