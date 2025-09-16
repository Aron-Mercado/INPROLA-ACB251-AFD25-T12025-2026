import java.util.Scanner;

public class scrapbook {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter Phone Number: ");
        int number = input.nextInt();
        System.out.println("Enter Birthday (mm/dd/yy): ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        
        System.out.println("---------------");
        System.out.println("##" + name + "##");
        System.out.println("<>" + address + "<>");
        System.out.println("@@" + number + "@@");
        System.out.println("!!" + month + day + year + "!!");

    }


}