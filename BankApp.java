package BankProject;
import java.util.*;

public class BankApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
    

        int choice = sc.nextInt();
        sc.nextLine();

        try {
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    bank.addAccount(accountNumber, accountHolderName, initialBalance);
                    break;
            
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    BankAccount accountToDeposit = bank.findAccount(accountNumber);
                    accountToDeposit.deposit(depositAmount);
                    break;
                
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    BankAccount accountToWithdraw = bank.findAccount(accountNumber);
                    accountToWithdraw.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account Number: ");
                    accountNumber = sc.nextLine();
                    BankAccount accountToCheck = bank.findAccount(accountNumber);
                    System.out.println("Balance: " + accountToCheck.getBalance());
                    break;
            
                case 5:
                    System.out.print("Enter account Number: ");
                    accountNumber = sc.nextLine();
                    BankAccount accountToGet = bank.findAccount(accountNumber);
                    System.out.println("Account Owner: " + accountToGet.getAccountHolderName());
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Current Balance: " + accountToGet.getBalance());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                    default:
                        System.out.println("Invalid option.Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
           }
        }  
    }
}
