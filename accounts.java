package homework.bankaccount;

public class accounts {
    public static void main(String[] args)
    {
        BankAccount andria = new BankAccount("Andria", 120.0);
        BankAccount anfisa = new BankAccount("Anfisa", 140.0);
        BankAccount iaroslav = new BankAccount("Iaroslav", 110.0);
        BankAccount luka = new BankAccount("Luka", 130.0);

        andria.deposit(50);
        anfisa.withdraw(20);
        iaroslav.transferTo(luka, 30);

        System.out.println(andria);
        System.out.println(anfisa);
        System.out.println(iaroslav);
        System.out.println(luka);

        System.out.println("Total transactions: $" 
                + BankAccount.getTotalTransactions());
    }
}
