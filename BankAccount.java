package homework;
/**
 * Represents a bank account with an owner and a balance.
 *
 * @author Anfisa
 * @version 2.0
 */
public class BankAccount
{
    // One total shared by all BankAccount objects
    private static double totalTransactions = 0.0;

    // Every account has its own owner and balance
    private String owner;
    private double balance;

    /**
     * Creates a new bank account.
     *
     * @param owner the name of the account owner
     * @param balance the starting balance
     */
    public BankAccount(String owner, double balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    /**
     * Returns the owner of the account.
     *
     * @return the owner's name
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * Returns the current account balance.
     *
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Adds money to the account.
     * Successful deposits count as transactions.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            totalTransactions += amount;
        }
    }

    /**
     * Withdraws money if there is enough money in the account.
     *
     * @param amount the amount to withdraw
     * @return true if the withdrawal succeeds, false otherwise
     */
    public boolean withdraw(double amount)
    {
        if (amount > balance || amount <= 0)
        {
            return false;
        }

        balance -= amount;
        totalTransactions += amount;
        return true;
    }

    /**
     * Transfers money to another bank account.
     *
     * @param other the account receiving the money
     * @param amount the amount to transfer
     */
    public void transferTo(BankAccount other, double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            other.balance += amount;

            totalTransactions += amount;
        }
    }

    /**
     * Returns the total amount of all successful transactions.
     *
     * @return the total amount processed
     */
    public static double getTotalTransactions()
    {
        return totalTransactions;
    }

    /**
     * Returns account information as text.
     *
     * @return owner and balance
     */
    public String toString()
    {
        return owner + ": $" + balance;
    }
}