interface Payment {
    void pay();
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using card");
    }
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Payment payment=new CardPayment();
        payment.pay();

        payment=new UpiPayment();
        payment.pay();
    }
}
