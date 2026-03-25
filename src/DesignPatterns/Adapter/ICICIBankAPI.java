package DesignPatterns.Adapter;

public class ICICIBankAPI {
    public int checkBalance(){
        System.out.println("Checking Balance via ICICI");
        return 100;
    }

    public void moneyTransfer(int amount){
        System.out.println("Transferring money via ICICI");
    }
}
