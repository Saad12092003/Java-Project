 class   Transaction {

    public void transfer(Customer sender, Customer receiver, double amount) {

        try {

            sender.withdraw(amount);

            receiver.Deposite(amount);

            System.out.println("Transfer Success!");

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}