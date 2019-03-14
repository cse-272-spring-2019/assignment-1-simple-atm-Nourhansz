
package atm2;

public class DepAmount {
    WithAmount withamount;
   private static double balance=WithAmount.getBalance();

    public void setWithamount(WithAmount withamount) {
        this.withamount = withamount;
    }

    public static void setBalance(double balance) {
        DepAmount.balance = balance;
    }

    public WithAmount getWithamount() {
        return withamount;
    }

    public static double getBalance() {
        return balance;
    }
    
    
     public static double valid(double amount)
    {
        balance=amount+balance;
        return balance;
    }
}
