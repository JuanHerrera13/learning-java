package encapsulatedByteBank;

public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder = new Client();

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

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }
}
