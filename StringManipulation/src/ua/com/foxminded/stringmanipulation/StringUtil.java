package ua.com.foxminded.stringmanipulation;

import java.util.Scanner;

public class StringUtil {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter your line: ");
		// String str = sc.nextLine();
		String source = "Hello World!";
		String[] words = source.split(" ");
		StringBuilder recoverSource = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			char[] letters = words[i].toCharArray();
			
			for (int j = 0; j < letters.length; j++) {
				System.out.println(letters[j]);
				recoverSource.append(letters[j]);
				System.out.println(recoverSource + " " + "(это recoverSource)");
			}
			if (i < words.length - 1) {
			recoverSource.append(" ");
			}
		}
	}
}