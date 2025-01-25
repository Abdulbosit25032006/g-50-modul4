package example.lesson1;

public class Card {

    private String cardNumber;
    private double balance;
    private boolean blocked;

    public Card(String cardNumber, double balance, boolean blocked) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.blocked = blocked;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", blocked=" + blocked +
                '}';
    }
}
