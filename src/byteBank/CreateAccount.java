package byteBank;
public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println("First account has $" + firstAccount.balance);

        firstAccount.balance += 100;
        System.out.println("First account has $" + firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println("Second account has $" + secondAccount.balance);
    }
}
