// example encapsulation

import java.util.Scanner;

public class Instructor2 extends Person {
    public static void main(String args[]) {

        Instructor2 instructor = new Instructor2();
        Scanner input = new Scanner(System.in);
	Scanner inputTwo = new Scanner(System.in);


        System.out.println("Enter a name: ");
        String name = input.nextLine();
        instructor.setName(name);
        System.out.println("Name of instructor is: " +  instructor.getName());

        System.out.println("Enter an age: ");
        int age = input.nextInt();
        instructor.setAge(age);

	System.out.println("Enter Gender: ");
        String gender = inputTwo.nextLine();
        instructor.setGender(gender);


    }

    public void setName(String s) {

            //Overides "setName" in parent class
            //a.k.a Overriding method 
            System.out.println("This is an overrding method.");

    }

    public void setAge(int i) {

            if (i % 2 == 0) {
                System.out.println("Age: " + i + " is Even");
            }
	    else {
		System.out.println("Age: " + i + " is Odd");	
	    }

    }

    public void setGender(String s) {

            if (s.equals("Male") || s.equals("male") || s.equals("Female") || s.equals("female")) {
		 System.out.println("Gender: " + s + " is Valid");
						}
	    	else {
			System.out.println("Input is Invalid.");
						}
	}
}
