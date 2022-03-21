public class arithmetic
{
    public static void main(String [] args)
    {
        try
        {
            System.out.println(":: TRY BLOCK ::");
            int n = 42/0;
            System.out.println(n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(":: CATCH BLOCK ::");
            System.out.println("ArithmeticException OCCURRED");
        }

        finally {
            System.out.println(":: FINALLY BLOCK ::");
            System.out.println("THANK YOU");
        }
        }
    }