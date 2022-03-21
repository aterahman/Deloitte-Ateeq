import java.util.*;
class shuffle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String st1 = sc.nextLine();
        int l1 = st1.length();
        System.out.println("Enter string 2");
        String st2 = sc.nextLine();
        int l2 = st2.length();
        System.out.println("Enter string 3");
        String st3 = sc.nextLine();
        int l3 = st3.length();
        int i,j=1,k=0,l=2;
        if((st3.charAt(0)==st2.charAt(0)) && (st3.charAt(l3-1)==st2.charAt(l2-1)))
        {
            for(i=1;i<l3-1;i++)
            {
                char c = st3.charAt(i);
                if(c==st2.charAt(j))
                {
                    j++;
                    l++;
                }
                else if(c==st1.charAt(k))
                {
                    k++;
                    l++;
                }

            }
            if(l==l3)
            System.out.println("Valid");
            else
                System.out.println("InValid");
        }
    }
}
