import java.util.Scanner;
public class Emp 
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        name=scan.nextLine();
        System.out.println("Enter Employee No.:");
        empno=scan.nextInt();
        scan.close();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No.:"+empno);
    }
    public static void main(String args[])
    {
        Emp e=new Emp();
        e.getData();
        System.out.println("\n Employee Details\n");
        System.out.println("-----------------");
        e.display();
    }
}
