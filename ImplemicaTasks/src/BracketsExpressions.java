import java.util.Scanner;

public class BracketsExpressions {

	public static void main(String[] args) {

		// First of all - we need to enter some brackets. Then, we enter the number of
		// correct bracket expressions that we entered in the previous line. After this
		// the program will check the string for the presence of bracket expressions,
		// determine if they are correct, how many there are and whether their number
		// matches the number entered by the user.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the arithmetic expression with brackets:");
		String str = sc.nextLine();
		System.out.print("Enter the number of correct pair brackets in expression:");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.print("Negative integer!");
			return;
		}
		System.out.println(getBrackets(str, n));
	}

	public static int getBrackets(String arithmeticExpr, int numOfBr) {
		// Variables that count amount of left and right brackets and compare if they
		// are equal.
		int countLfBr = 0;
		int countRtBr = 0;
		int countNumBr = 0;
		// Splitting the entered string into characters.
		char[] c = arithmeticExpr.toCharArray();
		// Iteration through all the characters in our string to see if it contains any
		// brackets.
		for (int i = 0; i < c.length; i++) {
			// Checking if our string contains and starts with left bracket. If it doesn't -
			// in that case we'll face the message which says that expression we entered
			// contains not a correct bracket expression. Also checks if the right
			// bracket comes anywhere before the left - which also means not correct bracket
			// expression. If all seems right - we add +1 to countLfBr and -1 to countRtBr.
			// The idea is: if we will get 0 in countLfBr and countRtBr at the end of
			// iteration, then the amount of left and right brackets is equal
			if (c[i] == '(' && countRtBr <= countLfBr) {
				countLfBr++;
				countRtBr--;
			}
			if (c[i] == ')') {
				countRtBr++;
				countLfBr--;
				// countNumBr - counts the total amount of brackets
				countNumBr++;
			}
		}
		// If the expression is right - we'll get 0 at countLfBr which means that there
		// is equal amount of left and right brackets. Also checks if amount of correct
		// bracket expressions equals to the number entered by user.
		if (countLfBr == 0 && countNumBr == numOfBr) {
			System.out.println("The amount of correct bracket expressions IS equal to numOfBr!");
			// If we got more or less left or right brackets which don't have a pair - than
			// our expression contains not correct bracket expressions.
		} else if (countLfBr < 0 || countLfBr == 1) {
			System.out.println("Not a correct bracket expression!");
			// If we entered one number of bracket expressions and than entered the number
			// which is less than total amount of bracket expressions - it doesn't satisfy
			// the conditions of the task.
		} else if (countNumBr > numOfBr) {
			System.out.println(
					"Too much bracket expressions! The amount of bracket expressions is NOT equal to numOfBr!");
		} else
			// Any other case means we got less correct bracket expressions than the number
			// we entered.
			System.out.println("The amount of correct bracket expressions is NOT equal to numOfBr!");
		System.out.print("The numOfBr = ");
		// Always return the number entered by user.
		return numOfBr;
	}
}
