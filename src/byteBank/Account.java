package byteBank;

public class Account {
    double balance;
    int agency;
    int number;
    Client holder = new Client();

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if (balance >= value) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if (balance >= value) {
            balance -= value;
            destiny.deposit(value);
            return true;
        }
            return false;
    }

    public double getBalance () {
        return this.balance;
    }
}
