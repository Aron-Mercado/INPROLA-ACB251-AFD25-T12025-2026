import java.util.Scanner;
public class TestBankWithdraw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BDO bdo = new BDO();
        System.out.println("Enter balance for BDO: ");
        bdo.setBalance(input.nextInt());
        System.out.println("Enter amount to withdraw from BDO: ");
        bdo.withdraw(input.nextInt());

        BPI bpi = new BPI();
        System.out.println("Enter balance for BPI: ");
        bpi.setBalance(input.nextInt());
        System.out.println("Enter amount to withdraw from BPI: ");
        bpi.withdraw(input.nextInt());

        SecurityBank se = new SecurityBank();
        System.out.println("Enter balance for Security Bank: ");
        se.setBalance(input.nextInt());
        System.out.println("Enter amount to withdraw from Security Bank: ");
        se.withdraw(input.nextInt());
    }
}