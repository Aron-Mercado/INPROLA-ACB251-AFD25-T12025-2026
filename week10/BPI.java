public class BPI extends Bancnet {
    //Private Int to help do if-else better
    private int balance;
    public void setBalance(int balance) {
        //Storing user inputted balance from the TestBankWithdraw.java to the private int
        this.balance = balance;
    }
    public void withdraw(int amount) {
        amount += 18;
        //If-else to check user current and remaining balance and amount withdrawed
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal from BPI successful. Amount: " + amount + " with 18 in transactional fees.");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds in BPI account. Current balance: " + balance);
        }
    }
}