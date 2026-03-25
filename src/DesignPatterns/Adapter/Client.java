package DesignPatterns.Adapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the Bank which you want to use :");
        String bankName =  scanner.next();
        BankAPI bankAPI = BankAPIFactory.getBankAPIbyBankName(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(50);
        phonePe.payBill("ABC" , 102);
    }
}
