package BankingApplicationListsChallenge;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Bank {
    String name;
    ArrayList<Customer> listOfCustomers;

    public Bank(String name) {
        this.name = name;
        this.listOfCustomers = new ArrayList<>();
    }

    public boolean customerExists(String name) {
        for (Customer customer : listOfCustomers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void addCustomer(Customer customer) {
        if (!customerExists(customer.getName())) {
            listOfCustomers.add(customer);
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void addTransaction(String customerName, double transaction) {
        for (Customer customer : listOfCustomers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                customer.getListOfTransactions().add(transaction);
                return;
            }
        }
        System.out.println("Customer doesn't exist.");
    }


    public void printCustomerAndTransactions(Customer customer) {
        for (Double transaction : customer.getListOfTransactions()) {
            System.out.println("Transaction: " + transaction);
        }
    }
}
