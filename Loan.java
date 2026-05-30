public class Loan {

    private int loanId;
    private double loanAmount;
    private double interestRate;
    private boolean approved;

    public Loan(int loanId, double loanAmount, double interestRate) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.approved = false;
    }

    public void approveLoan() {
        approved = true;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public double calculateTotalPayable() {
        return loanAmount + (loanAmount * interestRate / 100);
    }

    public String getLoanInfo() {
        return "Loan ID: " + loanId +
                "\nLoan Amount: $" + loanAmount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTotal Payable: $" + calculateTotalPayable() +
                "\nStatus: " + (approved ? "Approved" : "Pending");
    }
}