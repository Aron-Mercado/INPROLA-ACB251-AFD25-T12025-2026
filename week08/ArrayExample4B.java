
import java.util.Scanner; 

public class ArrayExample4B {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of scores: ");
        int size = input.nextInt();

        // Declare and initialize an array of integers
        int[] scores = new int[size];
        
        System.out.print("Enter Scores: ");
        for (int i = 0; i < size; i++) {
            scores[i] = input.nextInt();
        }

        // Assume the first element is the maximum
        int max = scores[0];

        // Find the maximum value
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // Print the maximum score
        System.out.println("The maximum score is: " + max);
    }
}
