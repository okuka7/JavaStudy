package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAcount account = new BankAcount();
        account.deposit(10000);
        account.withdra(3000);
        System.out.println(account.getBalance());
    }
}
