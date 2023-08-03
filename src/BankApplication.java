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

}
