import java.util.ArrayList;

class Customer extends person {
    private ArrayList<String> history = new ArrayList<>();

    public Customer(int AccountNumber, String AccountHolder, double balance) {

        super(AccountNumber, AccountHolder, balance);

        history.add("Account Opened with: " + balance);
    }

    void Deposite(double amount) throws InsufficientBalanceException {

        if (amount > 0) {
            updateBalance(amount);

         history.add("Deposited: " + amount + " | Current Balance: " + getBalance());
        } else {

            throw new InsufficientBalanceException("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= getBalance()) {

            deductBalance(amount);

            history.add("Withdrawn: " + amount + " | Current Balance: " + getBalance());
        } else {

            throw new InsufficientBalanceException("Insufficient Balance or Invalid Amount");
        }
    }

    public ArrayList<String> getHistory() {

        return history;
    }

    // Transfer er jonno alada history record
    public void addTransferHistory(String note) {

        history.add(note);
    }

    void display() {
        System.out.println("Acount Number : " + getNumber() + " | Name: " + getCustomerName() + " | Bal: " + getBalance());
    }
}