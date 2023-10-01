package com.isBalanced;

import java.util.Stack;

import java.io.*;
import java.util.*;

public class validArithmeticEvaluater {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\Users\\mddaz\\eclipse-workspace\\neebal\\Neebal\\validArithmeticEvaluater\\expresssionFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String expression = br.readLine();
			br.close();

			if (expression != null && !expression.isEmpty()) {
				if (!isBalanced(expression)) {
					writeToFile("Compile time error: Unbalanced parentheses");
					return;
				}

				if (!isValidOperators(expression)) {
					writeToFile("Compile time error: Invalid operators");
					return;
				}

				Scanner sc = new Scanner(System.in);
				
				Map<Character, Double> variables = new HashMap<>();
				for (char c : expression.toCharArray()) {
					if (Character.isAlphabetic(c)) {
						System.out.print("Enter value for variable " + c + ": ");
							double value = sc.nextDouble();
							variables.put(c, value);
					}
				}
				double result = evaluateExpression(expression, variables);
				writeToFile("Result: " + result);
			} else {
				System.out.println("Expression is empty");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		for (char c : expression.toCharArray()) {
			if (c == '(') {
				stack.push('(');
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean isValidOperators(String expression) {
		String operators = "+-*/";
		for (char c : expression.toCharArray()) {
			if (operators.contains(String.valueOf(c)) || Character.isAlphabetic(c)) {
				continue;
			} else if (c != ' ' && c != '(' && c != ')') {
				return false;
			}
		}
		return true;
	}

	public static double evaluateExpression(String expression, Map<Character, Double> variables) {
		Stack<Double> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		int i = 0;

		while (i < expression.length()) {
			char c = expression.charAt(i);

			if (Character.isWhitespace(c)) {
				i++;
				continue;
			}

			if (Character.isDigit(c) || c == '.') {
				StringBuilder operandBuilder = new StringBuilder();
				while (i < expression.length() && (Character.isDigit(c) || c == '.')) {
					operandBuilder.append(c);
					i++;
					if (i < expression.length()) {
						c = expression.charAt(i);
					}
				}
				operandStack.push(Double.parseDouble(operandBuilder.toString()));
			} else if (Character.isAlphabetic(c)) {

				double variableValue = variables.get(c);
				operandStack.push(variableValue);
				i++;
			} else if (isOperator(c)) {
				while (!operatorStack.isEmpty() && hasHigherPrecedence(c, operatorStack.peek())) {
					double operand2 = operandStack.pop();
					double operand1 = operandStack.pop();
					char operator = operatorStack.pop();
					operandStack.push(performOperation(operand1, operand2, operator));
				}
				operatorStack.push(c);
				i++;
			} else if (c == '(') {
				operatorStack.push(c);
				i++;
			} else if (c == ')') {
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
					char operator = operatorStack.pop();
					double operand2 = operandStack.pop();
					double operand1 = operandStack.pop();
					operandStack.push(performOperation(operand1, operand2, operator));
				}
				if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
					operatorStack.pop();
				}
				i++;
			} else {

				System.err.println("Compile time error: Invalid character '" + c + "'");
				return 0.0;
			}
		}

		while (!operatorStack.isEmpty()) {
			char operator = operatorStack.pop();
			double operand2 = operandStack.pop();
			double operand1 = operandStack.pop();
			operandStack.push(performOperation(operand1, operand2, operator));
		}

		if (!operandStack.isEmpty()) {
			return operandStack.pop();
		} else {
			System.err.println("Compile time error: Empty expression");
			return 0.0;
		}
	}

	public static boolean hasHigherPrecedence(char op1, char op2) {
		int precedence1 = getPrecedence(op1);
		int precedence2 = getPrecedence(op2);
		return precedence1 > precedence2;
	}

	static int getPrecedence(char c) {
		switch (c) {
		case '*':
		case '/':
		case '%':
			return 4;
		case '+':
		case '-':
			return 3;
		case '(':
		case ')':
			return 2;

		}
		return 0;
	}

	public static boolean isOperator(char c) {
		return c == '+' || c == '-' || c == '*' || c == '/';
	}

	public static double performOperation(double operand1, double operand2, char operator) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			if (operand2 == 0) {
				System.err.println("Compile time error: Division by zero");
				System.exit(1);
			} else {
				return operand1 / operand2;
			}

		default:
			System.err.println("Compile time error: Invalid operator '" + operator + "'");
			System.exit(1);
			return 0.0;
		}
	}

	public static void writeToFile(String message) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Result.txt"));
			bw.write(message);
			bw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
