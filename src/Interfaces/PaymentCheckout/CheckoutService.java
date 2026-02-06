package Interfaces.PaymentCheckout;

public class CheckoutService {
    public void makePayment(Payment payment){
        payment.process();
//        payment.refund();
    }
    public void makePayment(CreditCardPayment creditCardPayment){
        creditCardPayment.process();
        creditCardPayment.refund();
    }

    public void doRefund(Refundable refundable){
        refundable.refund();
    }
//    public void makePayment(UPIPayment upiPayment){
//        upiPayment.process();
//    }
//    public void makePayment(GiftCardPayment giftCardPayment){
//        giftCardPayment.process();
//    }
}
