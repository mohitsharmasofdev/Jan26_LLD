package Interfaces.PaymentCheckout;

public class Client {
    public static void main(String[] args) {

        CheckoutService checkoutService = new CheckoutService();

        // Payment is an abstract class
        // object creation is not allowed
//        Payment payment = new Payment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();
        GiftCardPayment giftCardPayment = new GiftCardPayment();

//        upiPayment.refund();
//        creditCardPayment.refund();

//        checkoutService.makePayment(payment);
        checkoutService.makePayment(creditCardPayment);
        checkoutService.makePayment(upiPayment);
        checkoutService.makePayment(giftCardPayment);

        checkoutService.doRefund(creditCardPayment);
        checkoutService.doRefund(giftCardPayment);
//        checkoutService.doRefund(upiPayment);
//        checkoutService.doRefund(new CashPayment());


//        Parent p = new Child();
//        p.func();
    }
}


