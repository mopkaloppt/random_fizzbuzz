import java.io.*;
import java.util.Scanner;

public class fizzB {

	public static void fizzB (String s) {

		if(s.equals(" ")) {
			System.out.println("empty string, nothing to look for!");
		}

		int len = s.length();
		//char[] str = s;
		int a = 0;
		int b = 0;

		for(int i=0; i < len; i++) {

			if(s.charAt(i) == 'a') {
				a++;	
			}

			if(s.charAt(i) == 'b') {
				b++;		
			}	
			System.out.println("a: " + a);
			System.out.println("b: " + b);			
		}


		// only 1 a and b
		if (a+b == 2) {
			System.out.println("FizzBuzz");
			return;
		}
		// contains a and b (1 to multiple times)
		if (a > 0 && b > 0) {
			System.out.println("BuzzBuzz");	
			return;
		}
		// contains a (1 to multiple times)
		if (a > 0) {
			System.out.println("Fizz");
			return;
		}
		// contains b (1 to multiple times)
		if (b > 0) {
			System.out.println("Buzz");
			return;
		}
		// neither a nor b
		if (a == 0 && b == 0) {
			System.out.println("FizzFizz");
			return;
		}
				
	}


	public static void main (String[] args) {

		Scanner user_input = new Scanner(System.in);
			String input;
			int i = 10;

			while (i != 0) {
				System.out.print("Input your string here: ");
				input = user_input.next();

				fizzB(input);

				i--;
			}
	}
}