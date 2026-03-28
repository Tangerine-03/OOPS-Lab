package graphics;
import java.util.Scanner;
public class Square implements Area_cal
{
    int a;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Side Length:");
        a=sc.nextInt();
        System.out.print("Area of Square:"+(a*a));
    }
}
