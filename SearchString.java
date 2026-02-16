import java.util.Scanner;
public class SearchString 
{
    public static void main(String args[])
    {
        int i,j,pos=0,f=0;
        boolean state=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Elements in an Array:");
        int num=s.nextInt();
        String word[]=new String[num];
        System.out.println("\n Enter "+num+" words:");
        for(i=0;i<num;i++)
        {
            word[i]=s.next();
        }
        System.out.println("Enter Element to be Searched:");
        String search=s.next();
        for(i=0;i<num;i++)
        {
            if(word[i].equals(search))
            {
                pos=i+1;
                state=true;
                break;
            }
        }
        if(state)
        {
            System.out.println("Element found at position = "+(pos));
        }
        else{
            System.out.println("Element not found.");
            s.close();
        }
    }
}
