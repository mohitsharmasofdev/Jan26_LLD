package Polymorphism.Overriding.PaymentCheckout;

public class GiftCardPayment extends Payment{
    public void process(){
        System.out.println("Processing payment via Gift Card");
    }
}
