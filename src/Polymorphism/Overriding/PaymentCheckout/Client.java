package Polymorphism.Overriding.PaymentCheckout;

public class Client {
    public static void main(String[] args) {

        CheckoutService checkoutService = new CheckoutService();

        Payment payment = new Payment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();
        GiftCardPayment giftCardPayment = new GiftCardPayment();


        checkoutService.makePayment(payment);
        checkoutService.makePayment(creditCardPayment);
        checkoutService.makePayment(upiPayment);
        checkoutService.makePayment(giftCardPayment);
    }
}
