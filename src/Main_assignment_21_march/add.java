package Main_assignment_21_march;

import java.io.*;
import java.util.Scanner;

public class add {

    static void agevalidate(int a) throws AgeException {
        if (a < 18 || a > 90)
            System.out.println("Age doesn't meet requirements");

    }

    static void phvalidate(String ph) throws PhoneException {
        if (ph.length() < 10 || ph.length() > 10)
            System.out.println("Invalid phone number");
        else {
            int l = 0;
            for (int i = 0; i < ph.length(); i++) {
                if (Character.isLetter(ph.charAt(i)))
                    l++;
            }
            if (l > 0)
                System.out.println("Invalid phone number");
        }
    }

    public void adduserdata() throws FileNotFoundException, IOException {
        File userdata = new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Userdata.csv");
        FileWriter fw = new FileWriter(userdata, true);
        PrintWriter pw = new PrintWriter(fw);
        Scanner sc = new Scanner(System.in);
        System.out.println("EnterUser ID");
        String uid = sc.nextLine();
        pw.print(uid);
        pw.print(",");

        System.out.println("Enter Name");
        String name = sc.nextLine();
        pw.print(name);
        pw.print(",");

        System.out.println("Enter Age");
        String age = sc.nextLine();
        try {
            agevalidate(Integer.parseInt(age));
        }
        catch (AgeException e) {
            System.out.println(e);
        }
        pw.print(age);
        pw.print(",");

        System.out.println("Company Name");
        String com = sc.nextLine();
        pw.print(com);
        pw.print(",");

        System.out.println("Enter Designation");
        String des = sc.nextLine();
        pw.print(des);
        pw.print(",");

        System.out.println("Enter Salary");
        String sal = sc.nextLine();
        pw.print(sal);
        pw.print(",");

        System.out.println("Enter Address");
        String addr = sc.nextLine();
        pw.print(addr);
        pw.print(",");

        System.out.println("Enter Phone number");

        String ph = sc.nextLine();

        try {
            phvalidate(ph);
        } catch (PhoneException e)
        {
            System.out.println(e);

        }
        pw.print(ph);
        pw.print("\n");

        pw.close();
    }
}





