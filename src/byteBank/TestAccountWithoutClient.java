package byteBank;

public class TestAccountWithoutClient {
    public static void main(String[] args) {
        Account waleskaAccount = new Account();

        System.out.println(waleskaAccount.holder);
        waleskaAccount.holder.name = "Waleska";

        System.out.println(waleskaAccount.holder.name);
    }
}
