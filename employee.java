public class employee extends person
{

    public employee(String employeeName,String employeeRole) {
        super(employeeName, employeeRole);
    }
     

void display()
{
     System.err.println("Empolyer Name : "+ employeeName);
     System.out.println("Position      : " + employeeRole);

}

}