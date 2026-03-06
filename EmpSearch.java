import java.util.Scanner;
class Employee 
{
    int eNo;
    String eName;
    double eSalary;
    Employee(int n,String name,double sal)
    {
        eNo=n;
        eName=name;
        eSalary=sal;
    }  
}  
class EmpSearch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of Employees:");
        int n=s.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n Enter details for Employee "+(i+1)+":");
            System.out.println("Employee Number:");
            int eno=s.nextInt();
            System.out.print("Employee Name:");
            String name=s.next();
            System.out.print("Employee Salary:");
            double salary=s.nextDouble();
            e[i]=new Employee(eno,name,salary);
        }
        System.out.print("\n Enter the Employee Number to Search:");
        int searchEno=s.nextInt();
        int flag=0;
        for(Employee emp:e)
        {
            if(emp.eNo==searchEno)
            {
                System.out.println("Employee Found:");
                System.out.println("Employee Number:"+emp.eNo);
                System.out.println("Employee Name:"+emp.eName);
                System.out.println("Employee Salary:"+emp.eSalary);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Employee with Employee Number "+searchEno+" not Found.");
        }
    }
}

