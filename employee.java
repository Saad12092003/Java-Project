public class employee extends person
{

    public employee(String employeeName,String employeeRole) {
        super(employeeName, employeeRole);
    }
     

void display()
{
     System.err.println("Empolyer name : "+ employeeName);
     System.out.println("position      : " + employeeRole);  //for displaying info

}



}