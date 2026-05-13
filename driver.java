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
        

      


        

        
    }

}