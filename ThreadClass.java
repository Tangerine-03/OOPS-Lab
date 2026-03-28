import java.util.Scanner;
class Multiplication extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Multiplication Table of 5:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" X 5 = "+i*5);
        }
        System.out.println("Exiting from Thread Mulltiplication...");
    }
}
class EvenNumbers extends Thread
{
    @Override
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Even Numbers Upto "+n);
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
public class ThreadClass 
{
    public static void main(String args[])
    {
        Multiplication a=new Multiplication();
        EvenNumbers b=new EvenNumbers();
        a.start();
        b.start();
    }    
}
