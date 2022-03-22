package Main_assignment_21_march;

import java.util.Scanner;

public class front {
    public char fr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** WELCOME TO USER DATABASE ****");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("Enter choice");
        char ch = sc.next().charAt(0);
        return ch;
    }
}
