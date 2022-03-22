package Main_assignment_21_march;

import javax.swing.*;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class login {



    //checks username
    public void checkusername() {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        String id = "";
        System.out.println("Enter Username:");
        String username = sc.nextLine();
        try {
            Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Records.csv"));
            ob.useDelimiter("[,\n]");
            while (ob.hasNext() && !found) {
                id = ob.next();
                if (id.equals(username)) {
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Username not found");
                checkusername();
            }

        } catch (Exception e) {
            System.out.println("Exception found");
        }
    }

    //checks password
    public void checkpassword()throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Scanner ob = new Scanner(new File("C:\\Users\\aterahman\\HU_JAVA_TRACK_ATEEQ_DELOITTE\\src\\Main_assignment_21_march\\Records.csv"));

        String p = "";
        ob.useDelimiter(",|\n");
        boolean found = false;
        System.out.println("Enter Password:");
        String pwd = sc.nextLine();
        while (ob.hasNext()) {
            p = ob.next();
            p.split(",");
            String[] value = p.split(",");
            if (value[0].equals(pwd)) {
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Incorrect password,enter again");
            checkpassword();
        }
    }
    public char loginmenu() throws IOException
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("**** WELCOME TO USER DATABASE ****");
        System.out.println("1. Add User Data");
        System.out.println("2. List User Data");
        System.out.println("3. Edit User Data");
        System.out.println("4. Delete User Data");
        System.out.println("5. Exit");
        char ch = sc.next().charAt(0);
        return ch;

    }

}