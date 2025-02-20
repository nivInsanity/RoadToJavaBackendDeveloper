package BankAccountChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void depositFunds() {
        BankAccount mariaAccount = new BankAccount();
        mariaAccount.setAccountNumber(123456789);
        mariaAccount.setAccountBalance(10000);
        mariaAccount.setCustomerName("Maria Kavinsky");
        mariaAccount.setEmail("maria@maria.maria");
        mariaAccount.setPhoneNumber(12346789);

        double accBalance = mariaAccount.depositFunds(2000.50);

        Assertions.assertEquals(12000.50, accBalance);
    }
    @Test
    void withdrawFunds() {
        BankAccount mariaAccount = new BankAccount();
        mariaAccount.setAccountNumber(123456789);
        mariaAccount.setAccountBalance(10000);
        mariaAccount.setCustomerName("Maria Kavinsky");
        mariaAccount.setEmail("maria@maria.maria");
        mariaAccount.setPhoneNumber(12346789);

        double accBalance = mariaAccount.withdrawFunds(100.25);

        Assertions.assertEquals(9899.75, accBalance);
    }
}