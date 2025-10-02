// example encapsulation

import java.util.Scanner;

public class Student1 extends Person {
    public static void main(String args[]) {

        Student student = new Student();
        Scanner input = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);

/////////////////////////////////////
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        student.setName(name);
        System.out.println("Name of student is: " +  student.getName());
/////////////////////////////////////
        System.out.println("Enter an age: ");
        int age = input.nextInt();
        student.setAge(age);
        System.out.println("Age of student is: " +  student.getAge());
/////////////////////////////////////
        System.out.println("Enter Gender: ");
        String gender = inputTwo.nextLine();
        student.setGender(gender);
        System.out.println("Gender of student is: " +  student.getGender());


        input.close();
        inputTwo.close();
    }
}