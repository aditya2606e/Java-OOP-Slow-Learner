
class Bank {
    static String bankName = "SBI";
    static int totalTransactions = 0;

    String name;
    double balance;

    Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        totalTransactions++;
        System.out.println("Deposited: Rs. " + amount);
    }

    void deposit(int amount) {
        balance += amount;
        totalTransactions++;
        System.out.println("Deposited: Rs. " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            totalTransactions++;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            totalTransactions++;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void showTotalTransactions() {
        System.out.println("Total Transactions: " + totalTransactions);
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank("Aditya", 5000);

        b.deposit(1000);
        b.withdraw(200);

        System.out.println("\n--- Account Details ---");
        b.display();

        Bank.showTotalTransactions();
    }
}
