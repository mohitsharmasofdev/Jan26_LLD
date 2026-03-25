package DesignPatterns.Adapter;

public class FastTagRecharge {
    public void recharge(int amount, BankAPI bankAPI){
        if(bankAPI.balanceCheck() >= amount){
            bankAPI.deductMoney(amount);
            System.out.println("Recharge Successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
