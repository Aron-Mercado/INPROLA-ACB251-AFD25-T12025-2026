import java.util.Scanner;
public class Calculator1 implements SampleCalculator {

    Scanner input = new Scanner(System.in);
    System.out.println("Please input integer to be added: ");

    private int sum=input.nextInt();
    private int difference=input.nextInt();
    private int product=input.nextInt();
    private int quotient=input.nextInt();
    public void add(int i) {

        sum += i;
    }
    public void subtract(int i) {

        difference -= i;
    }
    public void multiply(int i) {

        product *= i;
    }
    public void divide(int i) {

        quotient /= i;
    }

    public static void main(String args[]) {
        Calculator1 calc = new Calculator1();
        Scanner input2 = new Scanner(System.in);

        System.out.println("Please Input Second Value to be Added: ");
        int add2 = input2.nextInt();
        System.out.println("Please Input Second Value to be Subtracted: ");
        int sub2 = input2.nextInt();
        System.out.println("Please Input Second Value to be Multiplied: ");
        int mult2 = input2.nextInt();
        System.out.println("Please Input Second Value to be Divided: ");
        int div2 = input2.nextInt();

        calc.add(add2);
        System.out.println("Add result: " + calc.sum);

        calc.subtract(sub2);
        System.out.println("Subtract result: " + calc.difference);

        calc.multiply(mult2);
        System.out.println("Multiply result: " + calc.product);

        calc.divide(div2);
        System.out.println("Divide result: " + calc.quotient);


    }

}