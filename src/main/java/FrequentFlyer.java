public class FrequentFlyer {

    int balance;

    public FrequentFlyer(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static FrequentFlyer withInitialBalanceOf(int balance) {
        return new FrequentFlyer(balance);
    }

    public void flies(int distance) {
        this.balance += (distance/10);
    }

}
