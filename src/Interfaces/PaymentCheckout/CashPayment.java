package Interfaces.PaymentCheckout;

public class CashPayment extends Payment{
    @Override
    void process() {
        System.out.println("Processing payment via Cash!");
    }
}
