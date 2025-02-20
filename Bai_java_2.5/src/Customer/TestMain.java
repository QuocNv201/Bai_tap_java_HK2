package Customer;

public class TestMain {
	public static void main(String[] args) {
        Customer customer = new Customer(1001, "Join Wick", 'A');
        System.out.println(customer);  

        Account account = new Account(2001, customer, 500.0);
        System.out.println(account);  

        account.deposit(500.0);
        System.out.println("After deposit: " + account);

        account.withdraw(100.0);
        System.out.println("After withdrawal: " + account);

        account.withdraw(700.0);
        System.out.println("After failed withdrawal: " + account);
	}
}
