import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the x coordinate: ");
        int x=sc.nextInt();

        System.out.print("enter the y coordinate: ");
        int y=sc.nextInt();

        if(x>0&y>0){
              System.out.println("1st Quadrant");
        } else if(x<0&y>0){
            System.out.println("2nd Quadrant");
        } else if(x<0&y<0){
              System.out.println("3rd Quadrant");
        } else if(x>0&y<0) {
            System.out.println("4th Quadrant");
        } else if(x==0&y>0){
            System.out.println("Y axis");
        } else if(x==0&y<0){
            System.out.println("Y axis");
        } else if(x>0&y==0){
            System.out.println("X axis");
        } else if(x<0&y==0) {
            System.out.println("x axis");
        } else {
        System.out.println("origin");
    
        }
    }
    }