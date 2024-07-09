
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account milanAccount = new Account("Milan's account", 100.00);

        milanAccount.deposit(20.00);
        // Printing string(object0 here as there is string method in account that prints this
        System.out.println(milanAccount);
    }
}
