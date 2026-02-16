import java.util.Scanner;
public class Matrix 
{
    public static void main(String args[])
    {
        int rows,cols,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows=s.nextInt();
        System.out.println("Enter the number of columns:");
        cols=s.nextInt();
        int[][] mat=new int[rows][cols];
        System.out.println("Enter the elements of the Matrix:");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        System.out.println("Transpose of the Matrix");
        System.out.println("-----------------------");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(mat[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
