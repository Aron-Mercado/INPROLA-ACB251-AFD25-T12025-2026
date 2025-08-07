import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two values");

    // Numerical input
    int value1 = myObj.nextInt();
    double value2 = myObj.nextDouble();

    // Output input by user
    System.out.println("First Number: " + value1);
    System.out.println("Second Number: " + value2);

    // addition operator
    System.out.println("a + b = " + (a + b));
    // subtraction operator
    System.out.println("a - b = " + (a - b));
    // multiplication operator
    System.out.println("a * b = " + (a * b));
    // division operator
    System.out.println("a / b = " + (a / b));
    // modulo operator
    System.out.println("a % b = " + (a % b));


  }
}
