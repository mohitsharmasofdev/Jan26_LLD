package Interfaces.PaymentCheckout;

public class GiftCardPayment extends Payment implements Refundable{
    public void process(){
        System.out.println("Processing payment via Gift Card");
    }

    public void refund(){
        System.out.println("Refunding the amount via Gift card");
    }
}
