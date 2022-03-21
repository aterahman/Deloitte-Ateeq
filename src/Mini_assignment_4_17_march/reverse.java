import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class reverse
{
    public static void main(String[] args)
    {
        List <String>  s1 = new ArrayList<>(Arrays.asList("Hashedin","by","Deloitte"));

        Collections.reverse(s1);
        System.out.println(s1);
    }
}
