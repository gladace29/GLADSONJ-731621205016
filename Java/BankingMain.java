package glad1;

import java.util.*;

class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " from account " + accountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance;
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

    public void removeAccount(String accountNumber) {
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getAccountNumber().equals(accountNumber)) {
                iterator.remove();
                System.out.println("Account removed: " + account);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }

    public void depositToAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found with account number: " + accountNumber);
    }

    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("Accounts in the bank:");
            for (Account account : accounts) {
                System.out.println(account);
            }
        }
    }
}

class BankingMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123456789", "Gladson", 5000.00);
        Account account2 = new Account("987654321", "Godson", 3000.00);
        
        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAccounts();

        bank.depositToAccount("123456789", 1000.00);

        bank.withdrawFromAccount("113333", 500.00);  
        bank.displayAccounts();

        bank.removeAccount("113333");  

        bank.displayAccounts();
    }
}
