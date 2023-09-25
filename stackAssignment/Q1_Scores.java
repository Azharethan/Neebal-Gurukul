package stackAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q1_Scores {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","C");
//		List<String> list = Arrays.asList("5","2","C","D","+");
//		List<String> list = Arrays.asList("5", "-2", "4", "C", "D", "9", "+", "+");
		System.out.println(score(list));
	}

	static int score(List<String> list) {
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < list.size(); i++) {
			if (Character.isDigit(list.get(i).charAt(0))) {
				s.push(Integer.parseInt(list.get(i)));
			} else if (list.get(i).equals("D")) {
				s.push(2 * s.peek());

			} else if (list.get(i).equals("C")) {
				s.pop();
			} else if (list.get(i).equals("+")) {
				int c = s.pop();
				int d = s.pop();
				int e = c + d;
				s.push(c);
				s.push(d);
				s.push(e);
			}
		}
		int sum = 0;
		while (!s.empty()) {
			sum += s.pop();
		}

		return sum;
	}
}
