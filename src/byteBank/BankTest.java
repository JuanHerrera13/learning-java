package byteBank;

public class BankTest {
    public static void main(String[] args) {
        Client juan = new Client();
        juan.name = "Juan Herrera";
        juan.ssn = "1313131313";
        juan.profession = "developer";

        Account juanAccount = new Account();
        juanAccount.deposit(100);

        juanAccount.holder = juan;
        System.out.println(juanAccount.holder.name);

        /**
         * references the same object
         */
        System.out.println(juanAccount.holder);
        System.out.println(juan);
    }
}
