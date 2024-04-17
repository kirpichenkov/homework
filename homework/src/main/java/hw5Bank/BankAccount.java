package hw5Bank;

public class BankAccount {
    private int ID;
    private String cardHolderName;
    private int amount;
    private boolean isActive;

    public BankAccount(int ID, String cardHolderName, int amount, boolean isActive) {
        this.ID = ID;
        this.cardHolderName = cardHolderName;
        this.amount = amount;
        this.isActive = isActive;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ID=" + ID +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", amount=" + amount +
                ", isActive=" + isActive +
                '}';
    }
}
