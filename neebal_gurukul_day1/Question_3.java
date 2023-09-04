import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter days: ");
        int days=sc.nextInt();
        int years =days/365;
        int remainingDays=days%365;
        int months = remainingDays/30;
        int remainingDays1=remainingDays%30;
        int weeks =remainingDays1/7;
        int remainingDays2=remainingDays1%7;
        System.out.println(years+" Years: "+months+" Months: "+weeks+" Weeks: "+remainingDays2+" Days");
       

       
    }
}
