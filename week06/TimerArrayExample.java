import java.util.Timer;
import java.util.TimerTask;

public class TimerArrayExample {
    public static void main(String[] args) {
        // Create an array to hold multiple timers
        Timer[] timers = new Timer[3];

        // Initialize each timer in the array
        for (int i = 0; i < timers.length; i++) {
            timers[i] = new Timer();
            int timerIndex = i; // To use inside the TimerTask
            timers[i].schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Timer " + timerIndex + " executed at: " + System.currentTimeMillis());
                }
            }, (i + 1) * 1000); // Delay increases for each timer (1s, 2s, 3s)
        }
    }
}
