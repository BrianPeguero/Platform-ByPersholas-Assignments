package problem6;
import java.util.Scanner;

public class Calc {
	
	@SuppressWarnings("resource")
	public static String getExpression() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an expression: ");
		String expression = input.nextLine().replaceAll("\\s", "");
		
		return expression;
	}
	
	@SuppressWarnings("null")
	public static boolean isOperand(char c) {
		Character newC = (Character) c;
		boolean isOperand = false;
		if(newC.equals('+') || newC.equals('*') || newC.equals('/') || newC.equals('-')) {
			isOperand = true;
		} else {
			isOperand = false;
		}
		return isOperand;
	}
	
	
	public static String[] parseString(String expression) {
		String[] expressionElements = new String[3];
		String numb1 = "";
		String numb2 = "";
		
		
		int index = 0;
		
		while (!isOperand(expression.charAt(index))) {
			index++;
		}
		
		Character operand = expression.charAt(index);
		
		for (int i = 0; i <= expression.length() - 1; i++) {
			if(i < index) {
				numb1 = numb1 + expression.charAt(i);
			} else if (i > index) {
				numb2 = numb2 + expression.charAt(i);
			}
		}
		
		expressionElements[0] = numb1;
		expressionElements[1] = operand.toString();
		expressionElements[2] = numb2;
		
		return expressionElements;
	}
	
	public static double calc(String[] expression) {
		Double numb1 = Double.parseDouble(expression[0]);
		Double numb2 = Double.parseDouble(expression[2]);
		
		double ans = 0;
		switch(expression[1]) {
		case "+":
			ans = numb1 + numb2;
			break;
		case "-":
			ans = numb1 - numb2;
			break;
		case "*":
			ans = numb1 * numb2;
			break;
		case "/":
			ans = numb1 / numb2;
			break;
		}
		
		return ans;
	}
	
	public static void display(double ans) {
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = getExpression();
		String[] expressionElements = parseString(expression);
		double ans = calc(expressionElements);
		display(ans);
	}

}
