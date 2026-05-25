public class employee extends person
{

    public employee(String employeeName,String employeeRone) {
        super(employeeName, employeeRone);
    }
     

void display()
{
     System.err.println("Empolyer Name : "+ employeeName);
     System.out.println("Position      : " + employeeRole);

}

}