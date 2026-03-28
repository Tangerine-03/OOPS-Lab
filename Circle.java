package graphics;
import java.util.Scanner;
public class Circle implements Area_cal
{
    double radius;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Radius:");
        radius=sc.nextDouble();
        System.out.print("Area of Circle:"+(3.14*radius*radius));
    }
}
