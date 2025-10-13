import java.util.Scanner;
public class TestBankMegalink1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        PNB pnb = new PNB();
        System.out.println("Please input balance: ");
        pnb.setBalance(input.nextInt());

        pnb.balanceInquiry();
        System.out.println("Please input amount to be deposited: ");
        pnb.deposit(input.nextInt());
        System.out.println("Please input amount to be withdrawn: ");
        pnb.withdraw(input.nextInt());
    }
}