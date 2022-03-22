package Main_assignment_21_march;
import java.awt.*;
import java.io.File;
import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class employeerecords
{


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        employeerecords a = new employeerecords();
        login log = new login();
        register reg = new register();
        add ad = new add();
        listdata l = new listdata();
        update u = new update();
        deletedata del = new deletedata();

        front f = new front();
        char c = f.fr();
        while (c != 3) {
            switch (c) {
                case '1':
                    log.checkusername();
                    log.checkpassword();
                    char ch = log.loginmenu();
                    do {

                        if (ch == '1')
                            ad.adduserdata();
                        else if (ch == '2')
                            l.ld();
                        else if (ch == '3')
                            u.up();
                        else if (ch == '4')
                            del.dd();
                        ch = log.loginmenu();

                        if(ch=='5')
                            break;
                    }while(ch!=5);
                    break;
                case '2':
                    reg.regusername();
                    reg.regpassword();
                    reg.push();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
            c = f.fr();


        }

    }

}