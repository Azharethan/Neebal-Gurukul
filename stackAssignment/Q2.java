package stackAssignment;

import java.util.Stack;

public class Q2 {
	public static void main(String[] args) {

//		String [] arr = {"2","1","+","3","*"};
//		String [] arr = {"4","13","5","/","+"};
		String[] arr = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		int d = evaluatePostFix(arr);
		System.out.println(d);
	}

	static int evaluatePostFix(String[] str) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < str.length; i++) {
			char c = str[i].charAt(0);

			if (isNumeric(str[i])) {
				s.push((int) Integer.parseInt(str[i]));
			} else {
				int n1 = s.pop();
				int n2 = s.pop();

				switch (c) {
				case '+':
					s.push(n1 + n2);
					break;

				case '-':
					s.push(n2 - n1);
					break;

				case '*':
					s.push(n1 * n2);
					break;

				case '/':
					s.push(n2 / n1);
					break;
				}
			}
		}
		return s.pop();

	}

	static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}
		try {
			int i = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
