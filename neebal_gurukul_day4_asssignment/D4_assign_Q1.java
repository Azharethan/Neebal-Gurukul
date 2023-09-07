import java.util.Arrays;
public class D4_assign_Q1 {
    public static void main(String[] args) {
          int[] arr={9,18,12,13,15,17};
        for(int i=0,j=arr.length-1; i<j ;i++,j--){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        System.out.println(Arrays.toString(arr));

        
    }
}


      
        
