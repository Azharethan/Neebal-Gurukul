import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= 1; j--) {
                if (j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= n; j++) {
                if (i == j) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 5; j > 1; j--) {
                if (j == i) {
                    System.out.print(" " + (j - 1));
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i - 1; j++) {
                if (j == (i - 1)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
