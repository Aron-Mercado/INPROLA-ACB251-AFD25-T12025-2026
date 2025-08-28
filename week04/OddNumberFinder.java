/**
* EvenNumberFinder.java
* This is the "worker" class. It contains the core logic for
* finding and displaying even numbers within a given range.
* It is separated from the main application to improve organization and reusability.
*/
public class OddNumberFinder {

    /**
     * Iterates through a specified range and prints all even numbers.
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     */

    //Initialization, Conditional, Increment, Statement
    public void findAndDisplayOdd(int start, int end) {
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


        //Initialization, Conditional, Statement, Increment
        public void findAndDisplayOdd2(int start, int end) {
        System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a while loop to iterate from the start point to the end point
        int i = start;
        while (i <= end) {
            // Check if the current number (i) is even.
            // A number is even if the remainder when divided by 2 is 0.
            if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
        }
        i++;
      }
    }


      //Initialization, Statement, Increment, Conditional
       public void findAndDisplayOdd3(int start, int end) {
         System.out.println("\nOdd numbers in the range " + start + " to " + end + " are:");
 
        // Use a do loop to iterate from the start point to the end point
        int i = start;
        do {
                if (i % 2 != 0) {
                // If the number is even, print it to the console
                System.out.println(i);
        }
                i++;
    }        
    while (i <= end); { 
      }
    }



 public void findAndDisplayPrimeNumber(int start, int end);
 for (int x = start; x <= end; x++) {
      count = 0;  // Reset counter for each 'i'

      // Check for divisibility from 2 up to i/2
      for (int j = 2; j <= x / 2; j++) {
        if (x % j == 0) {
          count++;  // Increment if 'i' is divisible by 'j'
          break;  // Exit loop if a divisor is found
        }
      }

      // If the count is 0, 'i' is prime
      if (count == 0) {
        System.out.println(x);  // Output the prime number
      }
    }


}