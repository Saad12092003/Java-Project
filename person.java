
 abstract class person {
     private int AccountNumber;
     private String AccountHolder;
     private double balance;
      String employeeName;
      String employeeRole;

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

     abstract void display();

 }

