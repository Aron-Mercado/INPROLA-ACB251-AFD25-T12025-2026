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

//Code to make sure "number" is actually only digits
        if (number.matches("\\d+")) {
            System.out.println("Valid number: " + number);
        } else {
            System.out.println("Invalid input. Please enter only digits.");
        }

//--------------------------------------------------------------------------------------------
//Month Checker
        System.out.println("Enter Birthday (mm/dd/yy) as numbers ");
        System.out.println("Month: ");
        int month = input.nextInt();
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();
        int totalDays = 0;
        boolean isLeapYear;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            totalDays = 31;
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                totalDays = 30;
            } else {
                if (month == 2) {
                    if (isLeapYear == true) {
                        totalDays = 29;
                    } else {
                        totalDays = 28;
                    }
                } else {
                    System.out.println("Invalid Month Entered");
                    return;
                }
            }
        }


        if (day >= 1 && day <= totalDays) {
            System.out.println("Correct Date (dd/mm/yy): " + day + "/" + month + "/" + year);
            if (month == 2 && day == 29 && isLeapYear == true) {
                System.out.println("February 29 is valid because " + year + " is a leap year.");
            }
        } else {
            System.out.println("Invalid day for the given month and year.");
            return;
        }
//End part
//--------------------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("");
        System.out.println("***************");
        System.out.println("---------------");
        System.out.println("## " + name + " ##");
        System.out.println("<> " + address + " <>");
        System.out.println("@@ " + number + " @@");
        System.out.println("!! " + month + "/" + day + "/" + year + " !!");
        System.out.println("---------------");
        System.out.println("***************");

        input.close();
    }
}