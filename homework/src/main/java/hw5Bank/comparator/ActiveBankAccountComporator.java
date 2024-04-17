package hw5Bank.comparator;

import hw5Bank.BankAccount;

import java.util.Comparator;

public class ActiveBankAccountComporator implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public static int myCompare(BankAccount o1) {
        if (o1.isActive() == true) {
            return 1;
        } else return -1;
    }

}
