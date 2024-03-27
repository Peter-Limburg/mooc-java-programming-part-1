public class YourFirstAccount {

    public static void main(String[] args) {
        Account peterAccount = new Account("Peter's account", 100.00);
        peterAccount.deposit(20.0);
        System.out.println(peterAccount);
    }
}
