 package OOPS.encapsulation;
// 
//BLC

class Bank {
    String username = "Chirag";
    private int Password; // that can't be directly accessed from outside of the class.
    private float balance = 10000.00F;

    public void deposit(int amount, String name, int pass) {
        if (checkCredentials(username, pass)) {
            if (amount <= 0) {
                System.out.println("Alert! Someone trying to access your account ");
            } else {
                this.balance = this.balance + amount;
                System.out.println("The Balance after deposit is: " + this.balance);
            }
        } else {
            System.out.println("Invalid Credentials : Deposit Aborted");
        }
    }

    public void withdraw(int amount, String name, int pass) {
        if (checkCredentials(username, pass)) {
            this.balance = this.balance - amount;
            System.out.println("The Balance after withdraw is: " + this.balance);
        } else {
            System.out.println("Invalid credentials. Withdrawal Aborted.");
        }
    }

    public void password(int Password) {
        this.Password = Password;
    }

    private boolean checkCredentials(String name, int pass) {
        return name.equals(username) && pass == Password;
    }
}

// ELC
public class DataHiding {
    public static void main(String[] args) {
        Bank hacker = new Bank();
        // hacker.balance = -1000; // hacker directly access the balance and reduce 1000 rupees.
        hacker.password(789);
        hacker.deposit(500, "Chirag", 789);
        hacker.withdraw(500, "Chirag", 789);
    }
}
