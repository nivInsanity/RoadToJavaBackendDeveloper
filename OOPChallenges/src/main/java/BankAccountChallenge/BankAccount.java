package BankAccountChallenge;

public class BankAccount {
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public double depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.printf("Account balance is: %f", accountBalance);

        return accountBalance;
    }

    public double withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0 ) {
            System.out.printf("Insufficient funds! You only have %f funds!", accountBalance);
        } else {
            accountBalance -= withdrawalAmount;
            System.out.printf("Account balance is: %f", accountBalance);
        }
        return accountBalance;

    }

}
