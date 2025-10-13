// example encapsulation

import java.util.Scanner;

public class Instructor extends Person {
    public static void main(String args[]) {

        Instructor instructor = new Instructor();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = input.nextLine();
        instructor.setName(name);
        System.out.println("Name of instructor is: " +  instructor.getName());



    }

    public void setName(String s) {

            //Overides "setName" in parent class
            //a.k.a Overriding method 
            //super.setName(s);
            //System.out.println("This is an overrding method.");

    }

}