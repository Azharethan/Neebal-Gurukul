import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q5_D11_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.println("Enter a list of integers :");
        System.out.println("Enter -1 to stop adding :");

        while (true) {
            System.out.print("Enter an integer: ");
            String input = sc.nextLine();

            if (input.equals("-1")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                if (currentNumber == numbers.get(j)) {
                    System.out.println("Error: Duplicate number found: " + currentNumber);
                    return;
                }
            }
        }
        System.out.println("No duplicates found.");

    }

}
