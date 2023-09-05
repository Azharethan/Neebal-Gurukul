import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        int count=0;
        while(count<n){
            int c=a+b;
            if(c%2==0){
                System.out.print(c+" ");
                count++;
            }
            a=b;
            b=c; 
             
        }
       
    }
}
