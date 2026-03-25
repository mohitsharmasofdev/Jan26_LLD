package DesignPatterns.Adapter;

public class BankAPIFactory {
    public static BankAPI getBankAPIbyBankName(String bankName){
        BankAPI bankAPI = null;
        if(bankName.equals("YESBank")){
            bankAPI = new YesBankAPIAdapter();
        } else if(bankName.equals("ICICI")){
            bankAPI = new ICICIBankAPIAdapter();
        }
        return bankAPI;
    }
}
