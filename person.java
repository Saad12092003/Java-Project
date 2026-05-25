
 abstract class person {
     private int AccountNumber;
     private String AccountHolder;
     private double balance;
      String employeeName;
      String employeeRole;

       person(int  AccountNumber,String AccountHolder,double balance)
       {
          this.AccountNumber=AccountNumber;
          this.AccountHolder=AccountHolder;
          this.balance=balance;

       }
       person(String employeeName,String employeeRole)
       {

        this.employeeName=employeeName;
        this.employeeRole=employeeRole;
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

    void updateBalance(double amount)
    {
        balance += amount;
    }

     void deductBalance(double amount)
    {
        balance -= amount;
    }

     abstract void display();

 }

