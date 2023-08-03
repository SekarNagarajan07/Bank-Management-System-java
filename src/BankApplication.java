class BankApplication {
    public static void main(String[] args) {

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

}
