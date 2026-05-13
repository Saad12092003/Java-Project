public class driver
{
    public static void main(String[] args) {
        Customer c =new Customer();

        c.setCustomerNumber(122);
        c.setCustomerName("Shaad Bhuiyan Saad");
        c.setCustomerBalance(5000);
        c.Deposite(2000);
        c.withdraw(5000);
        c.display();


        System.err.println("  ");
    
      

        person e = new employee();
        e.employeeName="Sakib Khan";
        e.employeeRole="Accountant";
        e.display(); 

        // Saad er account theke Arif er account e transfer korar jonno transaction class erf object create 
        System.out.println("--- Transaction Start ---");
        
        // Arekta notun customer (jar kache taka jabe)
        Customer receiver = new Customer();
        receiver.setCustomerName("Arif Rahman");
        receiver.setCustomerBalance(1000);

        // Transaction logic use kora
        Transaction t = new Transaction();
        t.transfer(c, receiver, 1500); // Saad (c) theke Arif (receiver) ke 1500 taka pathano holo

        // Result check kora
        System.out.println("\nUpdated Receiver Info:");
        receiver.display();

      


        

        
    }

}