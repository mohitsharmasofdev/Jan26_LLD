package Interfaces.PaymentCheckout;

public class CreditCardPayment extends Payment implements Refundable{
    @Override
    public void process() {
        System.out.println("Processing payment via Credit Card");
    }

    public void refund(){
        System.out.println("Refunding the amount via credit card");
    }
}
