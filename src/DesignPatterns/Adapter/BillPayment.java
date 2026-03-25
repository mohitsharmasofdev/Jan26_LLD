package DesignPatterns.Adapter;

public class BillPayment {
    public void payBill(String billNumber , int amount, YesBankAPI yesBankAPI){
        Boolean isBillPending = true;
        if(isBillPending && yesBankAPI.getBalance() >= amount){
            yesBankAPI.transfer(amount);
            System.out.println("Bill Paid successfully!");
            return;
        } else if(!isBillPending){
            System.out.println("Bill already paid");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
