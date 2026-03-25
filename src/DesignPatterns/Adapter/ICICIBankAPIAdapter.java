package DesignPatterns.Adapter;

public class ICICIBankAPIAdapter implements BankAPI{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int balanceCheck() {
        return iciciBankAPI.checkBalance();
    }

    @Override
    public void deductMoney(int amount) {
        iciciBankAPI.moneyTransfer(amount);
    }
}
