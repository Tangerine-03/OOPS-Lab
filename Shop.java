import java.util.Scanner;
interface Calc
{
    void calculate();
}
class Bill implements Calc
{
    String pid,pname;
    int quantity;
    double price,total,amount=0;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter Product Details");
        System.out.println("--------------------");
        System.out.println("Product ID:");
        pid=sc.nextLine();
        System.out.println("Product Name:");
        pname=sc.nextLine();
        System.out.println("Quantity:");
        quantity=sc.nextInt();
        System.out.println("Price:");
        price=sc.nextDouble();
    }
    public void calculate()
    {
        total=quantity*price;
    }
    public void display()
    {
        System.out.println(pid+"\t"+pname+"\t"+quantity+"\t"+price+"\t"+total);
    }
}
class Shop
{
    public static void main(String args[])
    {
        int n,i,order_no;
        double namount=0;
        String date;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Bill Details");
        System.out.println("------------------");
        System.out.println("Order No.:");
        order_no=s.nextInt();
        System.out.println("Date:");
        date=s.next();
        System.out.println("Number of Products:");
        n=s.nextInt();
        Bill ob[]=new Bill[n];
        for(i=0;i<n;i++)
            ob[i]=new Bill();
        for(i=0;i<n;i++)
        {
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Order No.:"+order_no);
        System.out.println("Date:"+date);
        System.out.println("ProductID  Name    Quantity  UnitPrice  Total");
        System.out.println("--------------------------------------------");
        for(i=0;i<n;i++)
        {
            ob[i].display();
            namount+=ob[i].total;
        }
        System.out.println(" ");
        System.out.println("\t\tNet Amount\t"+namount);
    }
}
