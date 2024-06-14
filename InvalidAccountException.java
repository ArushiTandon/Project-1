package BankProject;
//InvalidAccountException.java
public class InvalidAccountException extends Exception{
    public InvalidAccountException(String message){
        super(message);
    }
}