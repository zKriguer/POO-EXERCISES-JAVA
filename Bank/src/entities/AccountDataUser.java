package entities;

public class AccountDataUser {
    private final int accountNumber;
    private String accountHolder;
    private double accountBalance;
    static double WITHDRAW_FEE = 5;

    public AccountDataUser(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public AccountDataUser(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double depositValue){
        this.accountBalance += depositValue;
    };

    public void withdraw(double withdrawValue){
        this.accountBalance -= (withdrawValue + WITHDRAW_FEE);
    };

    public String toString(){
        return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + accountBalance;
    };

}
