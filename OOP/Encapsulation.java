public class Encapsulation {
    private int balance;

    public void setBalance(int balance) {
        if(balance>=0)
            this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Encapsulation account=new Encapsulation();

        account.setBalance(5000);

        System.out.println(account.getBalance());
    }
}
