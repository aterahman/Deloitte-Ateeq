import java.util.*;
class negative
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter elements of array: ");
        int i,j,k,c=0;
        for(i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((a[i]+a[j])<0)
                    c++;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if((a[i]+a[j]+a[k])<0)
                        c++;
                }
            }
        }
        System.out.println("Number of sub arrays whose sum is negative is : " + c);
    }
}