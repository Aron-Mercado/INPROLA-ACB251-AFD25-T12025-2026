import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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


    Timer timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      int countdown = seconds;

      @Override
      public void run() {
        System.out.println(countdown);

        if (countdown <= 0) {
          System.out.println("Countdown complete!");
          timer.cancel(); // Stop the timer
        }

        countdown--;
      }
    }, 0, 1000); // Schedule the task to run every 1000 milliseconds (1 second)
  }
}
