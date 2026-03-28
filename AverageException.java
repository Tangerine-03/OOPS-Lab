import java.util.Scanner;
public class AverageException 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number of Integers:");
        int n=s.nextInt();
        System.out.println("Enter the Integers:");
        try
        {
            for(int i=0;i<n;i++)
            {
                int num=s.nextInt();
                if(num<0)
                {
                    throw new InputException("Number is not Positive!!");
                }
                sum+=num;
            }
            float avg=(float)sum/n;
            System.out.println("Average is:"+avg);
        }
        catch(InputException e)
        {
            System.out.println(e);
        }
    }    
}
