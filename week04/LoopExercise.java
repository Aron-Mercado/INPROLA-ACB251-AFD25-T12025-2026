import java.util.Scanner;

class LoopExercise {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two values:");

    // Numerical input
    int value1 = myObj.nextInt();
    int value2 = myObj.nextInt();

    // Output input by user
    System.out.println("First Number a = " + value1);
    System.out.println("Second Number b = " + value2);

    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun"+" from: "+i+ " to: "+n);

  }
}
