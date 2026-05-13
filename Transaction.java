class Transaction { 
    public void transfer(Customer sender, Customer receiver, double amount) {
        if (sender.getBalance() >= amount) {
            sender.withdraw(amount);
            receiver.Deposite(amount);
            System.out.println("Transfer Success!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}