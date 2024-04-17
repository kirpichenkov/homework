package hw5Bank;

import java.util.ArrayList;

import hw5Bank.BankAccountTransactions;

public class Main {
    public static void main(String[] args) {
        BankAccount sber = new BankAccount(001, "Ivan", 2000, true);
        BankAccount alfa = new BankAccount(002, "Ivan", 4500, false);
        BankAccount alfa2 = new BankAccount(003, "юрий", 4500, false);
        BankAccount alfa3 = new BankAccount(002, "Олег", 4500, false);
        BankAccount alfa4 = new BankAccount(005, "Павел", 4500, false);
        BankAccount alfa5 = new BankAccount(002, "ПЕтр", 4500, false);

        BankAccountTransactions.moneyTransfer(sber, alfa, 1000);
        System.out.println(alfa.getAmount());

        ArrayList<BankAccount> arrayList = new ArrayList<>();
        arrayList.add(sber);
        arrayList.add(alfa);
        arrayList.add(alfa2);
        arrayList.add(alfa3);
        arrayList.add(alfa4);
        arrayList.add(alfa5);


        System.out.println(BankAccountTransactions.listTEST(arrayList));

        System.out.println(BankAccountTransactions.searchForID(arrayList, 002));


    }
}
