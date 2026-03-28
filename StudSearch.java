import java.util.Scanner;
class Student 
{
    int sNo;
    String sName;
    int sMarks;
    Student(int n,String name,int marks)
    {
        sNo=n;
        sName=name;
        sMarks=marks;
    }  
}  
class StudSearch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of Students:");
        int n=s.nextInt();
        Student st[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n Enter details for Student "+(i+1)+":");
            System.out.println("Student ID:");
            int sNo=s.nextInt();
            System.out.print("Student Name:");
            String sName=s.next();
            System.out.print("Student Mark  :");
            int sMarks=s.nextInt();
            st[i]=new Student(sNo,sName,sMarks);
        }
        System.out.print("\n Enter the Student ID to Search:");
        int searchSno=s.nextInt();
        int flag=0;
        for(Student stud:st)
        {
            if(stud.sNo==searchSno)
            {
                System.out.println("Student Found:");
                System.out.println("Student ID:"+stud.sNo);
                System.out.println("Student Name:"+stud.sName);
                System.out.println("Student Mark:"+stud.sMarks);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Student with Student ID "+searchSno+"x not Found.");
        }
    }
}


