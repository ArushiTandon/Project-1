package BankProject;
public class Bank {
    private static int max_accounts = 10;
    private BankAccount[] accounts;
    private int accountCount;

    public Bank(){
        accounts = new BankAccount[max_accounts];
        accountCount = 0;
    }
    public void addAccount(String accountNumber, String accountHolderName, double initialBalance) throws Exception{
        if(accountCount >= max_accounts){
            throw new Exception("Bank cannot hold more than" + max_accounts);
        }
        accounts[accountCount++] = new BankAccount(accountNumber, accountHolderName, initialBalance);
        System.out.println("Account created: " + accountNumber);
    }
    public BankAccount findAccount(String accountNumber) throws InvalidAccountException{
        for(int i = 0; i < accountCount ; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        throw new InvalidAccountException("Account not found: " + accountNumber);
    }
}
