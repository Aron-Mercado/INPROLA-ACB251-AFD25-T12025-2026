// example encapsulation

import java.util.Scanner;

public class Student extends Person {
    public static void main(String args[]) {

        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = input.nextLine();
        student.setName(name);

        System.out.println("Name of student is: " +  student.getName());



    }
}