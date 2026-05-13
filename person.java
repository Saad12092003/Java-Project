 abstract class person
{
    protected  int AcountNumber;
   protected  String AcountHolder;
   protected  double balance;
    String employeName;
    String employeRole;
   
   person(int AcountNumber,String AccountHolder,double balance)
   {
    this.AcountNumber=AcountNumber;
    this.AcountHolder=AccountHolder;
    this.balance=balance;
   }
   
   person(String employeName,String employeRole)
   {
     this.employeName=employeName;
     this.employeRole=employeRole;
   }
   
   

   abstract void display(); 
   
   

}
