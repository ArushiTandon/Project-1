package BankProject;
//BankAccount.java

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidAccountException{
        if(amount <= 0){
            throw new InvalidAccountException("Deposit must be positive");
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAccountException{
        if(amount <= 0){
            throw new InvalidAccountException("Withdrawal amount must be psoitive");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
}  

