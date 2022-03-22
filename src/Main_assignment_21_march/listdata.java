package Main_assignment_21_march;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class listdata
{
    public void ld()throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Userdata.csv"));
        String p = "";
        System.out.println("Enter User id to list data");
        String uid = sc.nextLine();
        while(ob.hasNext())
        {
            p=ob.next();
            String [] values = p.split(",");
            if(values[0].equals(uid))
                    System.out.println(p);
        }

    }

}
