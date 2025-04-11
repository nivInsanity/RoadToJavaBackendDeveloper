package BankingApplicationListsChallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;
    private Customer customer;

    @BeforeEach
    void setUp() {
        bank = new Bank("Some bank name");
        customer = new Customer("Bob");
        bank.addCustomer(customer);
        bank.addTransaction("Bob", 240.50);
    }

    @Test
    void customerExistsTest() {
        boolean customerExist = bank.customerExists("Bob");
        boolean customerDoesNotExist = bank.customerExists("Jane");

        assertTrue(customerExist);
        assertFalse(customerDoesNotExist);
    }

    @Test
    void addCustomerTest() {
        bank.addCustomer(new Customer("Jane"));
        assertTrue(bank.customerExists("Jane"));
    }

    @Test
    void printCustomerAndTransactionsTest() {
        bank.printCustomerAndTransactions(customer);
    }
}