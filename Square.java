public class Square 
{
    double side;
    void getinput(double s)
    {
        side=s;
    }    
    double calArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        Square a=new Square();
        a.getinput(5);
        System.out.println("Area of the Square:"+a.calArea());
    }
}
