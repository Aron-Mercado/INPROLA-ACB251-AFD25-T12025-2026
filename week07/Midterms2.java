//Create a java program that will check a number from 1 to 100.
//Test if a number is even and if its even, check if its divisible by 3. 
//If its divisible by 3, display "Yes, this is divisible by 3" and the number
//If its not divisible by 3, display the number.
//If its odd, check if its divisible by 5. If it is, display "No, its divisible by 5" and the number.
//if its not divisible by 5, display " odd number not divisible by 5"

public class Midterms2 {
  public static void main(String[] args) {

        
       int start = 1;
       int end = 100;
       System.out.println("Numbers range is: " + start + " to " + end);
 
		//Looping of checking numbers 1 to 100//
        for (int i = 1; i <= end; i++) {

			//even checker
            if (i % 2 == 0) {
				//divisible by 3 checker
                if (i % 3 ==0) {
					System.out.println(i + " is divisible by 3");
				//not divisible, display number
				else {
					System.out.println(i);
									}
			}

			//odd else
	   		else {
				//check if odd is divisable by 5
				if (i % 5 ==0) {
					System.out.println(i + " is divisible by 5");
									}
				//odd is not divisable by 5
				else {
					System.out.println(i + " odd number not divisible by 5");

									}
		
			
            }
        }
	}
}