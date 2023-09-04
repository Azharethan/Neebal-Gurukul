import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("name of consumer: ");
        String name= sc.nextLine();
        System.out.print("units consumed by consumer: ");
        int unit= sc.nextInt();
        int electricBill;
        if(unit<=100){
            electricBill=unit*4;
        } else if(unit>100 && unit<=300){
            electricBill=(400+(unit-100)*5);
        } else {
            electricBill=(1400+((unit-300)*10));
        }

        if(electricBill>1000){
            double billAfterAdditionalCharge=electricBill+electricBill*0.05;
            double billAfterGst=billAfterAdditionalCharge+billAfterAdditionalCharge*0.18;
            System.out.println(billAfterGst);
        } else{
            System.out.println(electricBill);
        }

    }
}
