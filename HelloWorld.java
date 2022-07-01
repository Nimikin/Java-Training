package ua.com.foxminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {

		String message = "Hello World!";
		String words = "Java forever";
		String space = " ";
		int i = 42;
		int j = 3;
		int k = 6;
		int l = 7;
		int answer = k * l;
		int hugeNumber = 521124244;
		double d = 2.5;
		float answer2 = (float) k / (float) l;
		String answer1 = message + " " + answer;
		String number = "-2";
		int number1 = Integer.parseInt(number);
		int result = (answer + number1);
		String oneMoreAnswer = message + " " + result;
		boolean isMoreThanOne;

		if (answer2 > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}

		boolean evenNumber;
		if (answer2%2==0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}
		// System.out.println(message + space + words);
		// System.out.println(i + j);
		// System.out.println(answer);
		// System.out.println(k + l * d);
		//System.out.println(answer1);
		// System.out.println(oneMoreAnswer);
		// System.out.println(answer2);
		// System.out.println(hugeNumber % k);
		//System.out.println(answer2 + " " + isMoreThanOne);
		System.out.println(answer2 + " " + evenNumber);
		
	}

}
