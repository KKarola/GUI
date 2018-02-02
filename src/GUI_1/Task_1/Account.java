package GUI_1.Task_1;

public class Account {
    private double balance;
    private static double interestRate;

    public void deposit (int deposit) {
        try{
            if (deposit > 0) balance += deposit;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void withdraw (int withdraw) {
        try{
            if(balance >= withdraw) {
                balance -= withdraw;
            } else {
                System.out.println("You do not have enough money on your account.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void transfer (Account account, int transfer) {
        withdraw(transfer);
        if (balance >= transfer) account.deposit(transfer);

    }

    public static void setInterestRate (double interest) { interestRate = interest; }

    public void addInterest () { balance = (1 + interestRate/100) * balance; }

    public double getBalance() { return balance; }

}
