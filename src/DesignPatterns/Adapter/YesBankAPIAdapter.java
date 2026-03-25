package DesignPatterns.Adapter;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter(){
        yesBankAPI = new YesBankAPI();
    }
    @Override
    public int balanceCheck() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void deductMoney(int amount) {
        yesBankAPI.transfer(amount);
    }

//    @Override
//    public void availLoan(int amount) {
//        // dummy code
//    }
}
