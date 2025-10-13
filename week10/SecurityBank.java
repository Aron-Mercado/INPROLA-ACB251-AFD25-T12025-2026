public class SecurityBank extends Bancnet {
    //Private Int to help do if-else better
    private int balance;
    public void setBalance(int balance) {
        //Storing user inputted balance from the TestBankWithdraw.java to the private int
        this.balance = balance;
    }
    public void withdraw(int amount) {
        amount += 20;
        //If-else to check user current and remaining balance and amount withdrawed
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal from Security Bank successful. Amount: " + amount + " with 20 in transactional fees.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Security Bank account. Current balance: " + balance);
        }
    }
}