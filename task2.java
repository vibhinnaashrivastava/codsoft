// ATM INTERFACE 
import java.util.*;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return "Deposited " + amount + ". New balance: " + balance;
        }
        return "Deposit amount must be positive.";
    }

    public String withdraw(double amount) {
        if (amount > balance) {
            return "Insufficient balance.";
        } else if (amount <= 0) {
            return "Withdrawal amount must be positive.";
        } else {
            balance -= amount;
            return "Withdrawn " + amount + ". New balance: " + balance;
        }
    }

    public String checkBalance() {
        return "Current balance: " + balance;
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                System.out.println(bankAccount.withdraw(withdrawAmount));
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                System.out.println(bankAccount.deposit(depositAmount));
                break;
            case 3:
                System.out.println(bankAccount.checkBalance());
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}

public class task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("123456789", 1000);
        ATM atm = new ATM(account);

        while (true) {
            atm.displayMenu();
            System.out.print("Select an option: ");
            try {
                int option = scanner.nextInt();
                if (option == 4) {
                    atm.processOption(option, scanner);
                    break;
                } else {
                    atm.processOption(option, scanner);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
