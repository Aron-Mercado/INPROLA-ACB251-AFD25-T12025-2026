import java.util.Scanner;

public class TimerExercise {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner inputScanner = new Scanner(System.in);
 
        // Prompt the user for the starting number
        System.out.print("Enter Minutes: ");
        int minutes = inputScanner.nextInt();
 
        // Prompt the user for the ending number
        System.out.print("Enter Seconds: ");
        int seconds = inputScanner.nextInt();


    int[][] timer = { {minutes} , {seconds} };
    for (int[] row : timer) {
      for (int i : row) {
        System.out.println(i);


        
    }
   }
  }
 }
