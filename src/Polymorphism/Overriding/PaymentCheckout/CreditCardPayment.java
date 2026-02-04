package Polymorphism.Overriding.PaymentCheckout;

public class CreditCardPayment extends Payment{
    @Override
    public void process() {
        System.out.println("Processing payment via Credit Card");
    }
}
