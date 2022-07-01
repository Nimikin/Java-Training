import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	// Enter any number to count its factorial and then to count sum of factorial
	// digits.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter the number:");
		int i = sc.nextInt();
		System.out.print(sumDigits(i));
	}

	public static int sumDigits(int num) {
		// Big Integer in which we will store factorial of the entered number. In our
		// case - factorial of the number 100, which is very huge number and we cant
		// store it in "int" or "long".
		BigInteger fact = BigInteger.ONE;
		// We'll need string to store the number we'll get from Big Integer to split it
		// to the characters, so we can take value of all the digits in the factorial.
		String str = "";
		// Variable which will store sum of digits.
		int sumOfDigits = 0;
		// Counting factorial of entered number.
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		// Storing this number unto string
		str = fact.toString();
		// Splitting stored int the string number into characters.
		char[] c = str.toCharArray();
		// Iterating through all characters
		for (int i = 0; i < c.length; i++) {
			// Getting the numeric value from characters and summarize them. If we try to
			// summarize characters - we'll summarize their indexes under which the elements
			// stored in char type.
			sumOfDigits += Character.getNumericValue(c[i]);
		}
		System.out.print("Sum of the digits in the number " + num + "!(i.e. " + num + " factorial) is: ");
		return sumOfDigits;
	}
}
