package encapsulatedByteBank;

public class GetterAndSetterTest {
    public static void main(String[] args) {
        Account account = new Account(1337, 24226);
        System.out.println("Account number: " + account.getNumber());

        Client juan = new Client();

        juan.setName("Juan Herrera");
        account.setHolder(juan);
        System.out.println(account.getHolder().getName());

        juan.setProfession("Developer");
        System.out.println(account.getHolder().getProfession());
    }
}
