public class driver
{
    public static void main(String[] args) {
        Customer c =new Customer(100,"Saad",5000);
       try{
         c.Deposite(2000);
       }
       catch(InsufficientBalanceException e)
       {
        System.out.println(e.getMessage());
       }

       try
       {
         c.withdraw(5000);
       }
       catch(InsufficientBalanceException e)
       {
        System.err.println(e.getMessage());
       }

        c.display();


        System.err.println("  ");
    
      

        person e = new employee("Sakib","Acountant");
        e.display();
        
        // Saad er account theke Arif er account e transfer korar jonno transaction class erf object create 
        System.out.println("--- Transaction Start ---");
        
        // Arekta notun customer (jar kache taka jabe)
        Customer receiver = new Customer(100,"Alif",3000);
        

        // Transaction logic use kora
        Transaction t = new Transaction();
        t.transfer(c, receiver, 1500); // Saad (c) theke Arif (receiver) ke 1500 taka pathano holo

        // Result check kora
        System.out.println("\nUpdated Receiver Info:");
        receiver.display();

      


        

        
    }

}