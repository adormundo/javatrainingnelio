package upedowncast.application;

import upedowncast.entities.Account;
import upedowncast.entities.BusinessAccount;
import upedowncast.entities.SavingsAccount;

public class ProgramUpDown {
    public static void main(String[] args) {
        Account regularAccount = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING (subclass to superclass)
        Account accountFromBusinessAccount = businessAccount;
        Account accountFromNewBusinessAccount = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account accountFromNewSavingsAccount = new SavingsAccount(1004, "Juca", 0.0, 0.01);

        // DOWNCASTING (superclass to subclass)
        if (accountFromNewBusinessAccount instanceof BusinessAccount) {
            BusinessAccount downcastedBusinessAccount = (BusinessAccount) accountFromNewBusinessAccount;
            downcastedBusinessAccount.loan(100.0);
            System.out.println("Loan approved for downcastedBusinessAccount.");
        }

        if (accountFromNewSavingsAccount instanceof BusinessAccount) {
            BusinessAccount downcastedSavingsAccount = (BusinessAccount) accountFromNewSavingsAccount;
            downcastedSavingsAccount.loan(200.0);
            System.out.println("Loan approved for downcastedSavingsAccount.");
        } else {
            System.out.println("accountFromNewSavingsAccount is not a BusinessAccount.");
        }

        // Polymorphic method call
        printAccountBalance(accountFromBusinessAccount);
        printAccountBalance(accountFromNewBusinessAccount);
        printAccountBalance(accountFromNewSavingsAccount);
    }

    public static void printAccountBalance(Account account) {
        System.out.println("Account ID: " + account.getNumber() + ", Balance: " + account.getBalance());
    }
}