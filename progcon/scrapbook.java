import java.util.Scanner;

public class scrapbook {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter Phone Number: ");
        String number = input.nextLine();

        
        if (number.matches("\\d+")) {
            System.out.println("Valid number: " + number);
        } else {
            System.out.println("Invalid input. Please enter only digits.");
        }


        System.out.println("Enter Birthday (mm/dd/yy) as numbers ");
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();

        
        System.out.println("---------------");
        System.out.println("## " + name + " ##");
        System.out.println("<> " + address + " <>");
        System.out.println("@@ " + number + " @@");
        System.out.println("!! " + month + "/" + day + "/" + year + " !!");
        System.out.println("---------------");
    }


}