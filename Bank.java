import java.util.*;

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("--------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Account> accounts = new HashMap<>();

        while(true) {

            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    if(accounts.containsKey(accNo)) {
                        System.out.println("Account already exists!");
                        break;
                    }

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    Account account =
                            new Account(accNo, name, balance);

                    accounts.put(accNo, account);

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    if(accounts.containsKey(accNo)) {

                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();

                        accounts.get(accNo).deposit(amount);

                        System.out.println("Amount Deposited Successfully!");
                    }
                    else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    if(accounts.containsKey(accNo)) {

                        System.out.print("Enter Withdraw Amount: ");
                        double amount = sc.nextDouble();

                        if(accounts.get(accNo).withdraw(amount)) {
                            System.out.println("Withdrawal Successful!");
                        }
                        else {
                            System.out.println("Insufficient Balance!");
                        }
                    }
                    else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    if(accounts.containsKey(accNo)) {

                        System.out.println(
                            "Current Balance: " +
                            accounts.get(accNo).getBalance()
                        );
                    }
                    else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 5:
                    if(accounts.isEmpty()) {
                        System.out.println("No Accounts Found!");
                    }
                    else {
                        for(Account a : accounts.values()) {
                            a.display();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}