import java.util.Random;
import java.util.Scanner;

public class Q4_D11_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[100];
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10);
        }

        System.out.print("enter the index of the array: ");
        int index=sc.nextInt();
        try{
        if(index>=0&&index<100){
            System.out.println("your value at "+index+": "+arr[index]);
         } else {
            throw new Exception();
         }
        } catch(Exception e){
            System.out.println("out of bound");
        }
    }
}
