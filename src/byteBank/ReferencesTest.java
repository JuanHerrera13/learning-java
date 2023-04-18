package byteBank;
public class ReferencesTest {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;
        System.out.println("First account balance $" + firstAccount.balance);

        Account secondAccount = firstAccount;
        System.out.println("Second account balance $" + secondAccount.balance);

        secondAccount.balance += 100;
        System.out.println("Second account balance $" + secondAccount.balance);
        System.out.println("First account balance $" + firstAccount.balance);

        if (firstAccount == secondAccount) {
            System.out.println("Both are the same account");
            System.out.println(firstAccount);
            System.out.println(secondAccount);
        } else {
            System.out.println("Different accounts");
            System.out.println(firstAccount);
            System.out.println(secondAccount);
        }
    }
}
