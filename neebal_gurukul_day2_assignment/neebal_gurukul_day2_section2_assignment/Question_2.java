import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
    	 int n=5;
    	 for(int i=1;i<=n;i++) {
    		 for(int j=i*2-1;j>=i;j--) {
    			 System.out.print((char)(j+64)+" ");
    		 }
    		 System.out.println();
    	 }
    	 for(int i=n-1;i>0;i--) {
    		 for(int j=i*2-1;j>=i;j--) {
    			 System.out.print((char)(j+64)+" ");
    		 }
    		 System.out.println();
    	 }
    }
}
