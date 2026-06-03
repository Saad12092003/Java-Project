 class   Transaction {

    public void transfer(Customer sender, Customer receiver, double amount) {

        try {

            sender.withdraw(amount);

            receiver.Deposite(amount);

            System.out.println("Congratulations!Transfer Success!");

        } catch (InsufficientBalanceException e) {   //e exception object.error related info is stored in e

            System.out.println(e.getMessage());
        }
    }
}