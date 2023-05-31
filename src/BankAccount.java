public class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Felvétel
    public boolean withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    // Befizetés
    public double deposit(double amount) {
        this.balance += amount;
        return balance;
    }
    public double getBalance() {
        return this.balance;
    }
}
