package DesignPatterns.Adapter;

public class YesBankAPI {
    public int getBalance(){
        System.out.println("Checking Balance via Yes Bank");
        return 100;
    }

    public void transfer(int amount){
        System.out.println("Transferring money via Yes Bank");
    }
}
