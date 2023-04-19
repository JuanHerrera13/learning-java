package encapsulatedByteBank;

public class ValuesTest {
    public static void main(String[] args) {
        Account account = new Account(1337, 24226);
        System.out.println(account.getAgency());

        account.setAgency(1232123);
        System.out.println(account.getAgency());

        Account secondAccount = new Account(1337, 16549);
        System.out.println(secondAccount.getAgency());

        System.out.println(Account.getAccountsTotal());
    }
}
