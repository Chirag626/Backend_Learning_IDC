package OOPS.abstraction;
// 
/*
 Interface ----> An interface in Java is a blueprint of a class. 
* It has static constants(default),private and abstract methods.
* The interface is used to achieve abstraction and also supports Multiple Inheritance.
* Interfaces can have only abstract methods and variables. It cannot have a normal method body.
* It cannot be instantiated(can't create objects) just like the abstract class.
* It is mainly  used to achieve loose coSpling.

* if we add some fields then the fields are public static final(psf) by default added by compiler.
eg: int a = 20; 
public static final int a = 20; // here public  static final added by compiler by default
Loose CoSpling--> It is not totally dependent and if we are doing some changes it won't affect others.
 
isme public abstract methods hote hai agar hum nahi lagate hai to compiler automatically add krdeta hai.
eg: //public abstract\\ void show(); //compiler khud se add public abstract add krdeta hai.

*in java 8th version  we can add concrete default methods by using default access modifiers.
Example: default void show(){
                              }
* in java latest 9th version we can also use private methods in java.
 */

interface Bank_Account {

    public abstract void deposit(double amount); 
    void withdraw(double amount,String name); // public abstract is implicitily added by the compiler.
   
}

interface AccountInformation 
{
    // public abstract automatically added in this or any method.
    String getAccountHolderName(String name);
}
//Here "Mulitple Inheritance" can be achieved by interfaces.

interface AdvancedBankAccount extends Bank_Account, AccountInformation {
    // Method to transfer money between accounts
    void transfer(double amount, Bank_Account destinationAccount);
}

class AdvancedSavingsAccount implements AdvancedBankAccount {
    private double balance;
    private String accountHolderName;

    public AdvancedSavingsAccount(double initialBalance, String accountHolderName) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;

        System.out.println("Username : "+accountHolderName);
        System.out.println("Initial Balance: "+initialBalance);
    }

  
    public void deposit(double amount)
     {
        System.out.println("Deposited: "+amount);
        balance += amount;
    }


    public void withdraw(double amount,String name) {
        if (name.equals("Chirag") && amount <= balance) 
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } 
        else if(name != "Chirag")
        {
            System.out.println("Enter correct username: ");
        }
        else 
        {
            System.out.println("Insufficient funds.");
        }
    }

 
     public void transfer(double amount, Bank_Account destinationAccount) 
    {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println(amount + " transferred successfully.");
        } 
        else 
        {
            System.out.println("Insufficient funds for transfer.");
        }
    }


    public String getAccountHolderName(String name) 
    {
        System.out.println("Username: "+name);
        return accountHolderName;
    }

    // Method to check balance
    public double getBalance() 
    {
        return balance;
    }	
}

public class Interfaces {
    public static void main(String[] args) 
    {
        
        AdvancedSavingsAccount savingsAccount = new AdvancedSavingsAccount(20000, "Chirag");
        
        // Depositing 
        savingsAccount.deposit(10000);
        System.out.println("After deposit balance: "+savingsAccount.getBalance());

        // Withdrawing
        savingsAccount.withdraw(2000,"Chirag");

        // Checking the remaining balance
        System.out.println("After withdrawing Remaining balance: $" + savingsAccount.getBalance());

        // Transferring $1000 to another account
        Bank_Account destinationAccount = new AdvancedSavingsAccount(5000, "Kartik");
        savingsAccount.transfer(1000, destinationAccount);

        // Displaying destination account balance
        System.out.println("Destination account balance: $" + ((AdvancedSavingsAccount) destinationAccount).getBalance());
    }
}
