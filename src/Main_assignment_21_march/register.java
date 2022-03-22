package Main_assignment_21_march;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;

public class register
{
    String u;
    String pd;
    //Checks for password requirements
    static void pwdvalidate(String pwd) throws PwdException
    {
        int i, u = 0, l = 0, d = 0, s = 0;

        for (i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (Character.isUpperCase(ch))
                u++;
            else if (Character.isLowerCase(ch))
                l++;
            else if (Character.isDigit(ch))
                d++;
            else if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
                s++;

        }
        if (pwd.length() < 5)
            throw new PwdException("Password is too short");
        else if (pwd.length() > 10)
            throw new PwdException("Password exceeds limit");
        else {
            if (u < 1 || l < 1 || d < 1 || s < 1) {
                throw new PwdException("Password does not meet requirements");
            } else {
                System.out.println("Password meets requirements");
            }
        }
    }

    public void regusername()throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter New Username");

        String usn = sc.nextLine();
        boolean found = false;
        String id = "";
            Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Records.csv"));
            ob.useDelimiter(",|\n");
            while (ob.hasNext() && found) {
                id = ob.next();
                String [] value = id.split(",");
                if ((id.split(",")).equals(usn) || (id.split("\n")).equals(usn)) {
                    found = true;
                }
            }
            if (found==true) {
                System.out.println("Username already taken please enter a different Username");
                regusername();
            }

            u=usn;

    }

    public void regpassword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New Password");

        String pwd = sc.nextLine();
        boolean found = false;
        String p = "";
        try {
            Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Records.csv"));
            ob.useDelimiter(",");
            while (ob.hasNext() && found) {
                p = ob.next();
                if ((p.split(",")).equals(pwd) || (p.split("\n").equals(pwd))) {
                    found = true;
                }
            }
            if (found==true) {
                System.out.println("Password already taken please enter a different password");
                regpassword();
            }
            else
            {
                pwdvalidate(pwd);
                System.out.println("Renter Password");
                String rpwd = sc.nextLine();
                while(!(pwd.equals(rpwd))) {
                    System.out.println("Passwords donot match");
                    rpwd = sc.nextLine();
                }
                pd = pwd;
                System.out.println("User Successfully Created");


            }

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
    public void push()throws Exception
    {
        FileWriter record = new FileWriter("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Records.csv",true);
        PrintWriter pw = new PrintWriter(record);
        pw.print(u);
        pw.print(",");
        pw.print(pd);
        pw.print("\n");
        pw.close();

    }

}