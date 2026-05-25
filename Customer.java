
 class Customer extends person
{

    public Customer(int AccountNumber,String AccountHolder,double balance) {
        super(AccountNumber, AccountHolder, balance);
    }
    
    

    void Deposite(double amount) throws InsufficientBalanceException
    {
        if(amount>=0)
        {
            updateBalance(amount);
          
        }
        else
        {
            throw new InsufficientBalanceException("Isufficient Balance");
        }
       
    }


    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount >0 && amount <=getBalance())
        {
            deductBalance(amount);
            
        }
        else
        {
        
           throw new InsufficientBalanceException(" Insufficent Balance");
        }
    }

    void display()
    {
        System.err.println("Acount Number  : " +getNumber());
        System.out.println("Accout Holder  : " + getCustomerName());
        System.out.println("Balance        : " + getBalance());
        System.err.println(" ");
    }
}