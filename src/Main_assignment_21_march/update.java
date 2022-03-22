package Main_assignment_21_march;

import java.io.*;
import java.util.Scanner;

public class update
{
    public void up()throws IOException, FileNotFoundException
    {
        File userdata = new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Userdata.csv");
        FileWriter fw = new FileWriter(userdata,true);
        PrintWriter pw = new PrintWriter(userdata);
        Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Userdata.csv"));
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter column you want to edit [1-8]");
        String column = sc.nextLine();
        int c = Integer.parseInt(column);
        System.out.println("Enter new value");
        String nv = sc.nextLine();
        String p="";
        while(ob.hasNext())
        {
            p=ob.next();
            String value[]= p.split(",");
            System.out.println(value[c]);
        }

    }
}
