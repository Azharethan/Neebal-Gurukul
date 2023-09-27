package setsAndMapAssignment;

import java.util.Stack;

public class Q3_HappyNumber {
	public static void main(String[] args) {
		int n = 19;
		boolean isHappy = happyNumber(n);

		if (isHappy) {
			System.out.println(n + " is happy number");
		} else {
			System.out.println(n + " is not happy number");
		}
	}

	static boolean happyNumber(int n) {
		Stack<Integer> stack = new Stack<>();
		while (n != 1 && !stack.contains(n)) {
			stack.push(n);
			int sumOfSquareOfDigit = 0;
			while (n != 0) {
				int digit = n % 10;
				sumOfSquareOfDigit += digit * digit;
				n /= 10;
			}
			n = sumOfSquareOfDigit;
		}
		return n == 1;
	}
}
