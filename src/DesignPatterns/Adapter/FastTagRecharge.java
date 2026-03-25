package DesignPatterns.Adapter;

public class FastTagRecharge {
    public void recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance() >= amount){
            yesBankAPI.transfer(amount);
            System.out.println("Recharge Successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
