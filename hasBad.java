import java.io.*;
import java.util.Scanner; // import user's input



public class hasBad {


    boolean hasBad(String str) {

		if (str.length() == 3 && str.equals("bad")) {
			return true;
		}
		  
		if (str.equals("") || str.length() <= 3) {
		  return false;
		}
		  
		Boolean bAtZero = str.substring(0,3).equals("bad");
		Boolean bAtOne = str.substring(1,4).equals("bad");
		  
		if(bAtZero || bAtOne) {
		  
		  return true;
		} 

		return false;  
	}

	public boolean hasBad2(String str) {
	  if (str.length()>=3 && str.substring(0, 3).equals("bad")) {
	    return true;
	  }
	  if (str.length()>=4 && str.substring(1, 4).equals("bad")) {
	    return true;
	  }
	  return false;
		  
	  // Solution notes: basically want to call substring(0, 3) and
	  // substring(1, 4) and check if that equals "bad". Need to check
	  // the length first so as to not go off the end of the string.
	  // Alternately one could use indexOf() -- that code is short
	  // but it runs much slower, since it needlessly checks over the whole
	  // string.
	}


	public static void main(String args[]) {

			Scanner user_input = new Scanner(System.in);
			
			String input;

			int i = 10;

			while (i != 0) {

				System.out.print("Input your string here: ");
				input = user_input.next();

				hasBad(input);

				i--;
			}
	}
}








