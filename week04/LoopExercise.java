import java.util.Scanner;

class LoopExercise {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two values:");


    // Numerical input
    int i = myObj.nextInt();
    int n = myObj.nextInt();

    double z = (n % 2);

    // Output input by user
    System.out.println("First Number a = " + i);
    System.out.println("Second Number b = " + n);

    // for loop  

    if (z <= 0) {
        for (int m = i; i <= n; ++i) {
    

         System.out.println("Java is fun"+" from: "+i+ " to: "+n);

        }
    }
    else {

        System.out.println("Error");

            }
    }
}

