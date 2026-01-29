public class Rectangle 
{
    double length,breadth;
    void getdata(double l,double b)
    {
        length=l;
        breadth=b;
    }    
    double calArea()
    {
        return length*breadth;
    }
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.getdata(12.48,13);
        System.out.println("Area of Rectangle:"+r.calArea());
    }
}
