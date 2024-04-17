package hw5Bank;

import hw5Bank.Exception.ActiveBankAccountException;
import hw5Bank.Exception.NegativeBalansException;
import hw5Bank.comparator.ActiveBankAccountComporator;
import hw5Bank.comparator.comparablee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankAccountTransactions {
    public static void moneyTransfer(BankAccount bankAccount1, BankAccount bankAccount2, int amountTransfer) {
        if (bankAccount1.isActive() != true | bankAccount2.isActive() != true) {
            try {
                throw new ActiveBankAccountException("Exception: One of your bank accounts is blocked");
            } catch (ActiveBankAccountException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        if (bankAccount1.getAmount() - amountTransfer < 0) {
            try {
                throw new NegativeBalansException("There are not enough funds on your balance");
            } catch (NegativeBalansException e) {
                System.out.println(e.getMessage());
            }
        }
        bankAccount1.setAmount(bankAccount1.getAmount() - amountTransfer);
        bankAccount2.setAmount(bankAccount2.getAmount() + amountTransfer);
    }

    public static ArrayList<BankAccount> listTEST(ArrayList<BankAccount> listBankAccountNoActive) {
        // ArrayList<BankAccount> ArrayList = (ArrayList<BankAccount>) listBankAccount.stream().filter(a -> a.isActive()).collect(Collectors.toList());
        return listBankAccountNoActive = (ArrayList<BankAccount>) listBankAccountNoActive.stream().filter(a -> a.isActive()).collect(Collectors.toList());
    }

    public static ArrayList<BankAccount> searchForID(ArrayList<BankAccount> searchForArrayLiistBankAccaount, int ID) {
        return searchForArrayLiistBankAccaount = (ArrayList<BankAccount>) searchForArrayLiistBankAccaount.stream().filter(bankAccount1 -> bankAccount1.getID() == ID).collect(Collectors.toList());
    }


}
