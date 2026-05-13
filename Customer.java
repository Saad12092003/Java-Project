
 class Customer extends person
{
     void setCustomerNumber(int AccountNumber)
    {
        this.AccountNumber=AccountNumber;
    }
    void setCustomerName(String AccountHolder)
    {
        this.AccountHolder=AccountHolder;
    }
    void setCustomerBalance(double balance)
    {
        this.balance=balance;
    }

    public int getNumber()
    {
        return this.AccountNumber;
    }
    public String getCustomerName()
    {
        return this.AccountHolder;
    }
    public double getBalance()
    {
        return this.balance;
    }

    void Deposite(double amount)
    {
        if(amount>=0)
        {
            balance+=amount;
        }
    }


    void withdraw(double amount){
        if(amount >0 && amount <=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println(" Balance");
        }
    }

    void display()
    {
        System.err.println(getNumber());
        System.out.println(getCustomerName());
        System.out.println(getBalance());
    }
}