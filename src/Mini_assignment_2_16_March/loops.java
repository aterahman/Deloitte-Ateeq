import java.util.*;
public class loops
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        int i,j;
        for(i=0;i<r;i++) {
            for (j = 1; j <= r; j++) {
                if (j < (r - i))
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
        for(i=1;i<=r;i++)
        {
            for(j=r;j>0;j--)
            {
                if(j>(r-i))
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
        }


    }
}