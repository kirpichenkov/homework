package hw5Bank.comparator;

import hw5Bank.BankAccount;

public class comparablee implements Comparable<BankAccount> {
    @Override
    public int compareTo(BankAccount o) {
        if(o.isActive()==true){
            return 1;
        }else{
            return -1;
        }
    }
}
