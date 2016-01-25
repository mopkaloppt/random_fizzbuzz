import java.io.*;
import java.util.Scanner;



public class cigarParty {
	

	public static boolean setRange(int val) {
        if (val >= 40 && val <= 60) {
            return true;
        }
        else {
         
            throw new IllegalArgumentException("Not a weekend, can't smoke much!");
        }
    }

	public static boolean cigarParty(int cigars, boolean isWeekend) {

		// weekend false case
		// cigars not inbound return false 
		if(isWeekend == false) {
			setRange(cigars);
		}
		// weekend true case 
		// doesn't matter
			return true; 		
	}


	public static void main (String[] args) {

		Scanner user_input = new Scanner(System.in);
			int input;
			String input2;
			
			int i = 10;

			while (i != 0) {
				System.out.println("How many cigars you wanna smoke? - ");
				input = user_input.nextInt();
				System.out.println("Is today weekend? - ");
				input2 = user_input.next();

				boolean bool = Boolean.valueOf(input2);

				cigarParty(input, bool);

				i--;
			}
	}

}





/* 

 SOLUTION:

 public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend) {
    return (cigars >= 40);
  
  } else {
    return (cigars >= 40 && cigars <= 60);
  }
}



*/
