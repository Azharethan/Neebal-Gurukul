import java.util.*;
public class D4_assign_Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n ;i++){
            System.out.println("enter the element of array: ");
            arr[i]=sc.nextInt();
        }


        int min=0;
        for(int i=1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min=i; 
        }
    }
    System.out.println("index of smallest element in arr: "+min);
}
}
