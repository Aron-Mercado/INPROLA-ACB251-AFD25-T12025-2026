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
 
        for (int i = 1; i <= end; i++) {
            if (i % 2 == 0) {
                if (i % 3 ==0) {
					System.out.println(i + " is divisible by 3");
									}
				else {
					System.out.println(i);
									}
			}

	   		else {
				if (i % 5 ==0) {
					System.out.println(i + " is divisible by 5");
									}
				else {
					System.out.println(i + " odd number not divisable by 5");

									}
		
			
            }
        }
}







}