import java.util.Scanner;
public class Shapes 
{
    void area(int r1)
    {
        System.out.println("\n Area of Circle with Radius "+r1+"="+3.14*r1*r1);
    }
    void area(int l1,int b1)
    {
        System.out.println("\n Area of Rectangle with Dimensions "+l1+"x"+b1+"="+l1*b1);
    }
    void area(int l2,int b2,int h2)
    {
        System.out.println("\n Area of Cuboid is with Dimensions "+l2+"x"+b2+"x"+h2+"="+l2*b2*h2);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter the Length:");
        int l=s.nextInt();
        System.out.println("Enter the Breadth:");
        int b=s.nextInt();
        System.out.println("Enter the Height:");
        int h=s.nextInt();
        System.out.println("Enter the Radius:");
        int r=s.nextInt();
        Shapes ob=new Shapes();
        ob.area(r);
        ob.area(l,b);
        ob.area(l,b,h);
    }
}
