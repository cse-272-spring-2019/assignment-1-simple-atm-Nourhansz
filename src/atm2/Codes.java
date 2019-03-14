package atm2;

import java.util.Scanner;

public class Codes {

    private static double balance = 0;

    Deposit deposit;
    ATM2 atm;

    static double withdraw(double withdraw) {

        if (withdraw > balance) {
            System.out.println("Sorry your balance amount is less than the withdrawal amount");
        } else if (withdraw == 0) {
            System.out.println("Your balance remains the same");
        } else if (withdraw < 0) {
            balance = balance - 0;
        } else {
            balance = balance - withdraw;
            System.out.println("You have drawn " + withdraw + " and your new balance is " + balance + "");
        }
      
        return balance;
    }
    static boolean validation(double withdraw)
    {
        if(withdraw>balance)
            return false;
        else return true;
    }

    static double deposit(double deposit) {

        balance = balance + deposit;
        System.out.println("You have deposited " + deposit + " and your new balance is " + balance + "");
        return balance;

    }

    public static void setBalance(double balance) {
        Codes.balance = balance;
    }

    public static double getBalance() {
        return balance;
    }

    static double getCurrentBalance() {

        balance = balance - 0;
        System.out.println("Your current balance is " + balance + "");

        return balance;
    }

} 