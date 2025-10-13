public class PNG extends Bank {

    private int balance;
    public void setBalance(int i) {
        balance=i;
    }

    public int getBalance(){
        return balance;
    }
    public void balanceInquiry(){
        balance -= this.transactionCharge;
        System.out.println("Current balance: " + getBalance());
    }
    public void deposit(int i) {
        balance+=i;
        balance-=this.transactionCharge;
        System.out.println("Deposit value is: " + i);
        System.out.println("Current balance is: " + getBalance());
    }
    public void withdraw(int i) {
        balance-=i;
        balance-=this.transactionCharge;
        System.out.println("Withdraw value is: " + i);
        System.out.println("Current balance is: " + getBalance());
    }
}