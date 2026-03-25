package DesignPatterns.Adapter;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;

    public PhonePe(BankAPI bankAPI){
//        bankAPI = new YesBankAPIAdapter();
        this.bankAPI = bankAPI;
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(amount, bankAPI);
    }

    public void payBill(String billNumber , int amount){
        billPayment.payBill(billNumber , amount , bankAPI);
    }
}
