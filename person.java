 abstract class person
{
    protected int AcountNumber;
   protected String AcountHolder;
   protected double balance;
   public String employeName;
   public String employeRole;
   person(String employeName,String employeRole)
   {
     this.employeName=employeName;
     this.employeRole=employeRole;
   }
   person(int AcountNumber,String AccountHolder,int balance)
   {

    this.AcountHolder=AccountHolder;
    this.balance=balance;
   }
   
   public String getname()
   {
     return this.AcountHolder;
   }
   public int getnumber()
   {
    return this.AcountNumber;
   }
   public double getbalance()
   {
    return this.balance;
   }

   abstract void display(); 

}
