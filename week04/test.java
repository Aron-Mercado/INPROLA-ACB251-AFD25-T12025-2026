
public class WorkerQuiz1 {

    /**
     * Iterates through a specified range and prints all even numbers.
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     */


//Program identifies if the numbers are odd or even//
public void numberChecker(int start, int end) {
	System.out.println("\nNumbers in the range " + start + " to " + end + " are:");

	//Loop to allow each value to be checked//
 	while (start <= end) {
		//Modulo is used to identify if even//
         	   if (start % 2 == 0) {
         	       System.out.println(start + " is Even");
         	   } 
		   else {
          	      System.out.println(start + " is Odd");
          	  }
		//To continue the loop by checking the first numbe range until he last number in teh range is hit//
         	   start++;
        	}
	 System.out.println("");
}

/////////////////////////////////////////////////////////////////////////////////////

//Program identifies if the ODD numbers are also PRIME numbers//
public void oddChecker(int start, int end) {

 while (start <= end) {
            if (start % 2 != 0) { // Check if the number is odd
                if (isPrime(start)) { // Check if the number is prime
                    System.out.println(start + " = Odd and Prime Number");
                }
            }
            start++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
            i++;
        }
        return true; // Number is prime
    }
}


//Program identifies if the EVEN numbers are DIVISIBLE by 3//

public void evenChecker(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a for loop to iterate from the start point to the end point
        for (int i = start; i <= end; i++) {
            // Check if the current number (i) is even.
            // A number is even if the remainder when divided by 2 is 0.
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
                findAndDisplayPrimeNumber(i);
            }
        }
    }
}




