package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal
{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Breadth:");
        b=sc.nextInt();
        System.out.print("Input Height:");
        h=sc.nextInt();
        System.out.print("Area of Triangle:"+(0.5*b*h));
        
    }
}
