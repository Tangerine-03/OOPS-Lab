import java.util.Scanner;
public class Employee 
{
    int empid,TA,DA,HRA,Tax,basic,netsal;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee Name, ID, TA, DA, HRA, Tax, Basic Salary:");
        name=scan.nextLine();
        empid=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();
        basic=scan.nextInt();
        scan.close();
    }
    void cal()
    {
        netsal=(basic+TA+DA+HRA)-Tax;
        System.out.println("Net Salary:"+netsal);
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.getData();
        System.out.println("Employee Details");
        System.out.println("Employee ID:"+e.empid);
        System.out.println("Employee Name:"+e.name);
        e.cal();
    }
}
