import java.io.*;
import java.util.Scanner; // import user's input

class printString {


	public static void printString(String str) {

		Boolean firstF = str.startsWith("f");
		Boolean lastB = str.endsWith("b");

		
			if (firstF && lastB) {
				System.out.println("FizzBuzz");
			}
			else if (firstF) {
				System.out.println("Fizz");
			}
			else if (lastB) {
				System.out.println("Buzz");
			}
			else{
				System.out.println(str);
			}

		
	}


	public static void main(String args[]) {

		Scanner user_input = new Scanner(System.in);
		
		String input;

		int i = 10;

		while (i != 0) {

			System.out.print("Input your string here: ");
			input = user_input.next();

			printString(input);

			i--;
		}
	}
}

