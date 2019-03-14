package atm2;
public class WithAmount {
    private static double balance=20;

    public WithAmount(double balance) {
        this.balance=balance;
    }

    public  void setBalance(double balance) {
        this.balance = balance;
    }
    public static double getBalance() {
        return balance;
    }
    public static double valid(double amount)
    {
        if(balance>=amount)
        balance=balance-amount;
        else balance=balance-0;
        return balance;
        
    }
}
