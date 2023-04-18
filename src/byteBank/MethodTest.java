package byteBank;
public class MethodTest {
    public static void main(String[] args) {
        Account juanAccount = new Account();
        juanAccount.balance = 100;
        juanAccount.deposit(50);
        System.out.println("Juan balance $" + juanAccount.balance);

        boolean managedToWithdraw = juanAccount.withdraw(20);
        System.out.println("Juan balance $" + juanAccount.balance + " after withdraw");
        System.out.println(managedToWithdraw);

        Account waleskaAccount = new Account();
        waleskaAccount.deposit(1000);

        System.out.println("Waleska balance $" + waleskaAccount.balance);
        System.out.println("Juan balance $" + juanAccount.balance);
        /**
         * Other way:
         * boolean transferSuccess = waleskaAccount.transfer(300, juanAccount);
         * if(transferSuccess) { . . .
         */
        if (waleskaAccount.transfer(300, juanAccount)) {
            System.out.println("The transfer was successful");
        } else {
            System.out.println("You don't have enough balance!");
        }
        System.out.println("Waleska balance $" + waleskaAccount.balance + " after the transfer.");
        System.out.println("Juan balance $" + juanAccount.balance + " after the transfer.");
    }
}
