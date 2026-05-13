
 class Customer extends person
{
    

    void Deposite(double amount)
    {
        if(amount>=0)
        {
           setCustomerBalance(getBalance() + amount);
        }
    }


    void withdraw(double amount){
        if(amount >0 && amount <=getBalance())
        {
            setCustomerBalance(getBalance() - amount);
        }
        else
        {
            System.out.println(" Balance");
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