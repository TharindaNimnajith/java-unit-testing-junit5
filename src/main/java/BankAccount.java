public class BankAccount {
    private final double minimumBalance;
    private double balance;
    private boolean isActive = true;
    private String holderName;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    @SuppressWarnings("unused")
    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    @SuppressWarnings("unused")
    public void setActive(boolean active) {
        isActive = active;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    @SuppressWarnings("UnusedReturnValue")
    public double withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }

    @SuppressWarnings("CommentedOutCode")
    public double deposit(double amount) {
        //try {
        //    Thread.sleep(1);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        return balance += amount;
    }
}
