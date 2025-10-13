public class BDO extends Bancnet {
    //Private Int to help do if-else better
    private int balance;
    public void setBalance(int balance) {
        //Storing user inputted balance from the TestBankWithdraw.java to the private int
        this.balance = balance;
    }
    public void withdraw(int amount) {
        //If-else to check user current and remaining balance and amount withdrawed
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal from BDO successful. Amount: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds in BDO account. Current balance: " + balance);
        }
    }
}