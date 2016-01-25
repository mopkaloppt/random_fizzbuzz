import java.io.*;
import java.util.Scanner;

public class reverseCStr {
	
	public static void reverseCStr(String str) {

		str = new StringBuffer(str).reverse().toString();

		// int len = s.length();
		// for (int i = 0; i < len; i++) {
		// 	int temp = s.charAt(i);
		// 	s.charAt(i) = s.charAt(len-1);
		// 	s.charAt(len-1) = temp;
		// }

		System.out.println(str);

		//return s;
	}


	public static void main (String[] args) {

		Scanner user_input = new Scanner(System.in);
			String input;
			int i = 10;

			while (i != 0) {
				System.out.print("Input your string here: ");
				input = user_input.next();

				reverseCStr(input);

				i--;
			}
	}

}