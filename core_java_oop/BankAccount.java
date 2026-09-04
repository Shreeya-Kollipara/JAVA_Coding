public class BankAccount {

    private double balance;

    void deposit(double amount) {
        balance+=amount;
    }

    void withdraw(double amount) {
        if(amount<=balance)
            balance-=amount;
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.deposit(1000);
        account.withdraw(250);

        System.out.println(account.balance);
    }
}
