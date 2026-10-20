/**
 * A bank account with a balance that can never go below zero.
 *
 * @author Anfisa
 * @version 1.0
 */
public class BankAccount{
    // class variables — one copy, shared by all accounts
    private static int numAccounts = 0;
    public static final double MIN_BALANCE = 0.0;
    private static double totalTransactions = 0.0;

    // instance variables — every account has its own
    private String owner;
    private double balance;

    // constructors
    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
        numAccounts++;
    }

    public BankAccount(String owner)
    {
        this.owner = owner;
        balance = 0.0;
        numAccounts++;
    }

    // accessor methods
    public String getOwner()
    {
        return owner;
    }

    public double getBalance()
    {
        return balance;
    }

    // mutator methods
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            BankAccount.totalTransactions += amount;
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > balance)
        {
            return false;
        }
        balance -= amount;
        BankAccount.totalTransactions += amount;
        return true;
    }

    // methods with object parameters
    public void transferTo(BankAccount other, double amount)
    {
        if (withdraw(amount))
        {
            other.balance += amount;
            BankAccount.totalTransactions += amount;
        }
    }

    public boolean isRicherThan(BankAccount other)
    {
        return this.balance > other.balance;
    }

    // method total transactions 
    public static double getTotalTransactions()
    {
       
        return BankAccount.totalTransactions;
    }

    // class method
    public static int getNumAccounts()
    {
        return numAccounts;
    }

    public String toString()
    {
        return owner + ": $" + balance;
    }
//      public static void main(String[] args)
//     {
// BankAccount ana = new BankAccount("Ana", 50.0);
// BankAccount ben = new BankAccount("Ben");

// ana.deposit(25.5);
// System.out.println(ana.getBalance());            // 75.5
// System.out.println(ana.withdraw(100));           // false — not enough money
// ana.transferTo(ben, 30);
// System.out.println(ana);                         // Ana: $45.5
// System.out.println(ben);                         // Ben: $30.0
// System.out.println(BankAccount.getNumAccounts()); // 2
//     }
}
