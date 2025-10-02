// example encapsulation

import java.util.Scanner;

public class Instructor extends Person {
    public static void main(String args[]) {

        Instructor instructor = new Instructor();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = input.nextLine();
        instructor.setName(name);
        System.out.println("Name of student is: " +  Instructor.getName());



    }

    public void setName(String s) {

            this.setName(s);

    }

}