public class employee extends person
{
    employee(String employeName,String employeRole)
    {
        super(employeName,employeRole);
    }

  public String getname()
   {
     return this.employeName;
   }
     public String getrole()
   {
     return this.employeRole;
   }

void display()
{
     System.err.println(getname());
     System.out.println(getrole());

}


}