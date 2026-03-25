package DesignPatterns.Adapter;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;

    public PhonePe(){
        yesBankAPI = new YesBankAPI();
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(amount, yesBankAPI);
    }

    public void payBill(String billNumber , int amount){
        billPayment.payBill(billNumber , amount , yesBankAPI);
    }
}
