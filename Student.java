import java.util.Scanner;
public class Student
{
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Student Name,Roll No and Marks of 3 subject:");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void cal()
    {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("Total Marks:"+total);
        System.out.println("Average:"+average);
    }
    public static void main(String args[])
    {
        Student r=new Student();
        r.getdata();
        System.out.println("Student Details");
        System.out.println("Name:"+r.name);
        System.out.println("Roll No.:"+r.rollno);
        r.cal();
    }
}