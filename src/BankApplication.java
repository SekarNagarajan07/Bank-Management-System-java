import java.util.Scanner;

class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you 'Name' and 'CustomerId' to access your Bank account");
        String name = sc.nextLine();
        String customerId = sc.nextLine();

        BankAccount bank = new BankAccount(name, customerId);
        bank.menu();

    }
}

class BankAccount {
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    // Deposit

    void deposit(double amount) {
        if (amount != 0) {
            bal = bal + amount;
            prevTrans = amount;
        }
    }

    // Withdraw

    void withdraw(double amt) {
        if (amt != 0 && bal >= amt) {
            bal = bal - amt;
            prevTrans = prevTrans - amt;
        } else {
            if (bal < amt) {
                System.out.println("Bank baa=lance insufficient");
            }
        }
    }

    // previousTranstitions

    void getPreviousTrans() {
        if (prevTrans > 0)

        {
            System.out.println("Deposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction occured");
        }
    }

    void menu() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your Id:" + customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do {
            System.out.print("Choose an option");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'a': {
                    System.out.println("Balance =" + bal);
                    System.out.println("\n");
                    break;
                }

                case 'b': {
                    System.out.println("Enter a amount to deposit :");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                }

                case 'c': {
                    System.out.println("Enter a amount to withdraw :");
                    double amtWithdraw = sc.nextDouble();
                    withdraw(amtWithdraw);
                    System.out.println("\n");
                    break;
                }

                case 'd': {
                    System.out.println("Previous Transaction :");
                    getPreviousTrans();
                    System.out.println("\n");
                }
                case 'e': {
                    System.out.println("Exit");
                    break;
                }

                default: {
                    System.out.println("Choose a correct option to proceed");
                }
            }
        }

        while (option != 'e');

        System.out.println("Thank you for using our banking services");

    }

}
