package byteBank;
public class NegativeWithdrawTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        System.out.println(account.withdraw(200));
        System.out.println(account.getBalance());

        /**
         * prohibited
         * account.balance -= 101;
         * System.out.println(account.balance);
         */
    }
}
