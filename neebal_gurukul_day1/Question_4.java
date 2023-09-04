import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of X: ");
        int booking=sc.nextInt();
        int busServiceOperates=booking/50;
        int peopleTravel=busServiceOperates*50;
        System.out.println(peopleTravel);
        
    }
}
