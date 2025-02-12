package Assignment2;

public class BankTest {
    public static void main(String[] args) {
        Bank transaction = new Bank();

        // Making deposits and withdrawals
        transaction.deposit(5.50);
        transaction.deposit(7.70);
        transaction.withdrawal(-3.00);
        transaction.withdrawal(-0.56);
        
        // Entering an invalid amount for a deposit
        transaction.deposit(-5.00);

        // Entering an invalid amount for a withdrawal
        transaction.withdrawal(3.25);

        // Printing transactions ArrayList.
        transaction.listInteractions();
    }
}
