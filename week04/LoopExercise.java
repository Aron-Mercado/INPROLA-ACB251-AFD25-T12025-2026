import java.util.Scanner;

class LoopExercise {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two values:");

    // Numerical input
    int n = myObj.nextInt();
    int i = myObj.nextInt();

    // Output input by user
    System.out.println("First Number a = " + n);
    System.out.println("Second Number b = " + i);

    // for loop  
    for (int m = i; i <= n; ++i) {
      System.out.println("Java is fun"+" from: "+i+ " to: "+n);

        }
    }
}