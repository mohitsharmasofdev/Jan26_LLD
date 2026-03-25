package DesignPatterns.Adapter;

public class BillPayment {
    public void payBill(String billNumber , int amount, BankAPI bankAPI){
        Boolean isBillPending = true;
        if(isBillPending && bankAPI.balanceCheck() >= amount){
            bankAPI.deductMoney(amount);
            System.out.println("Bill Paid successfully!");
            return;
        } else if(!isBillPending){
            System.out.println("Bill already paid");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
