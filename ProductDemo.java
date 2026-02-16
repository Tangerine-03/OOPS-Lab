class Product
{
    int pcode;
    String pname;
    double price;
    double lowest;
    Product(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    }
    void findLowest(double price1,double price2,double price3)
    {
        if(price1<price2&&price1<price3)
        {
            System.out.println("\n Product 1 is of the Lowest Price!");
        }
        else if(price2<price1&&price2<price3)
        {
            System.out.println("\n Product 2 is of the Lowest Price!");
        }
        else
        {
            System.out.println("\n Product 3 is of the Lowest Price!");
        }
    }
}
public class ProductDemo 
{
    public static void main(String args[])
    {
        Product obj1=new Product(101,"Product_1",100.00);
        Product obj2=new Product(102,"Product_2",128.40);
        Product obj3=new Product(103,"Product_3",790.00);
        System.out.println("Product Information");
        System.out.println("-------------------");
        System.out.println("Product_Code \t Product_Name \t Product_Price");
        obj1.display();
        obj2.display();
        obj3.display();
        obj1.findLowest(obj1.price,obj2.price,obj3.price);
    }
}
