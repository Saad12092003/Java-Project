import java.util.ArrayList;

class Customer extends person {

    private ArrayList<String> history = new ArrayList<>();

    private Loan loan;

    public Customer(int AccountNumber, String AccountHolder, double balance) {

        super(AccountNumber, AccountHolder, balance);

        history.add("Account Opened with: " + balance);
    }

    void Deposite(double amount) throws InsufficientBalanceException {

        if (amount > 0) {

            setBalance(getBalance()+amount);

            history.add("Deposited: " + amount +  " | Current Balance: " + getBalance());

        } else {

            throw new InsufficientBalanceException("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > 0 && amount <= getBalance()) {

            setBalance(getBalance()-amount);

            history.add("Withdrawn: " + amount + " | Current Balance: " + getBalance());

        } else {

            throw new InsufficientBalanceException(  "Insufficient Balance");
        }
    }

    public ArrayList<String> getHistory() {

        return history;
    }

    public void applyLoan(Loan loan) {

        this.loan = loan;

        history.add("Loan Approved: " + loan.getLoanAmount());
    }

    public Loan getLoan() {

        return loan;
    }


    public void addTransferHistory(String note) {

        history.add(note);
    }

    void display() {

        System.out.println(  "Acount Number : " + getNumber() + " | Name: " + getCustomerName() + " | Balance: " + getBalance());
    }
}