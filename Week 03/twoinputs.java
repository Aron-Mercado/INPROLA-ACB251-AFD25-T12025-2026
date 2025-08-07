import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two values:");

    // Numerical input
    int value1 = myObj.nextInt();
    int value2 = myObj.nextInt();

    // Output input by user
    System.out.println("First Number a = " + value1);
    System.out.println("Second Number b = " + value2);

    // addition operator
    System.out.println("a + b = " + (value1 + value2));
    // subtraction operator
    System.out.println("a - b = " + (value1 - value2));
    // multiplication operator
    System.out.println("a * b = " + (value1 * value2));
    // division operator
    System.out.println("a / b = " + (value1 / value2));


  }
}
