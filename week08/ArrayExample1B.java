import java.util.Scanner;

public class ArrayExample1B {
	public static void main(String args[]) {


	Scanner input = new Scanner(System.in);
	System.out.println("Please Input Array Values: ");
	int arrayValue1 = input.nextInt();
	int arrayValue2 = input.nextInt();
	int arrayValue3 = input.nextInt();
	int arrayValue4 = input.nextInt();
	int arrayValue5 = input.nextInt();

	int [] numbers = {arrayValue1, arrayValue2, arrayValue3, arrayValue4, arrayValue5};

	System.out.println("Elements of the array: ");

	for (int i = 0; i < numbers.length; i++) {
		System.out.println("Elements at index: " + i + ": " + numbers[i]);

		}

    input.close();

	}
}