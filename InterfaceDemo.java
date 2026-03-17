interface Vehicle
{
    String NAME="I10";
    void msg();
}
class Car implements Vehicle{
    int cno=6789;
    public void msg()
    {
        System.out.println("Vehicle Name:"+NAME);
        System.out.println("Vehicle No.:"+cno);
    }
}
class InterfaceDemo 
{
    public static void main(String args[])
    {
        Car ob=new Car();
        ob.msg();
    }    
}
