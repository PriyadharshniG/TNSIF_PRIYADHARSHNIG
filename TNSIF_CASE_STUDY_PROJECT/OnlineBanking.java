package project;

import java.util.*;

class Account {
    private String accountNumber;
    private String name;
    private String password;
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();

    public Account(String accountNumber, String name, String password, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
        this.balance = initialDeposit;
        transactionHistory.add("Account created with initial deposit: ₹" + initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: ₹" + amount + " | New Balance: ₹" + balance);
            return true;
        } else {
            transactionHistory.add("Failed withdrawal attempt of ₹" + amount);
            return false;
        }
    }

    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History for " + name + " ---");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        System.out.println("--------------------------------------------\n");
    }
}

public class OnlineBankingSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Online Banking System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using Online Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }

    private static void createAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Create a password: ");
        String password = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String accNumber = "ACC" + (accounts.size() + 1001);
        Account newAccount = new Account(accNumber, name, password, amount);
        accounts.put(accNumber, newAccount);
        System.out.println("Account created successfully! Your Account Number: " + accNumber);
        System.out.println();
    }

    private static void login() {
        System.out.print("Enter your Account Number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        Account account = accounts.get(accNumber);
        if (account != null && account.validatePassword(password)) {
            System.out.println("\nWelcome, " + account.getName() + "!");
            bankingMenu(account);
        } else {
            System.out.println("Invalid account number or password.\n");
        }
    }

    private static void bankingMenu(Account account) {
        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = scanner.nextDouble();
                    if (account.withdraw(withdraw)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Logged out successfully!\n");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}

