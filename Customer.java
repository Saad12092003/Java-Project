
public class Customer extends person
{
    Customer(int AcountNumber,String AcountHolder,int balance)
    {
        super(AcountNumber,AcountHolder,balance);

    }
    void display()
    {
        System.out.println(AcountHolder);
        System.out.println(balance);
    }
    void deposite(double amount)
    {
        if(amount>=0)
        {
            balance+=amount;
        }
    }

    void withdraw(double amount)
    {
        if(amount >0 && amount <=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insuffient Balance");
        }
    }
}