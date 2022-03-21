import java.util.Scanner;

public class Password {
    static void validate(String pwd) throws PasswordException {
        int i, u = 0, l = 0, d = 0, s = 0;

        for (i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (Character.isUpperCase(ch) == true)
                u++;
            else if (Character.isLowerCase(ch) == true)
                l++;
            else if (Character.isDigit(ch) == true)
                d++;
            else if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
                s++;

        }
        if (pwd.length()<5)
            throw new PasswordException("Password is too short");
        else if(pwd.length()>10)
            throw new PasswordException("Password exceeds limit");
        else {
            if (u < 1 || l < 1 || d < 1 || s < 1) {
                throw new PasswordException("Password does not meet requirements");
            } else {
                System.out.println("Password meets requirements");
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: Password length must be between 5 and 10 characters");
        System.out.println("Note: it must contain at least one Upper case letter, one lower case letter, one digit and one special character");
        System.out.println("Enter new password");
        String p = sc.nextLine();
        try {
            validate(p);
        } catch (PasswordException e) {
            System.out.println("Caught exception");
            System.out.println("Exception is" + e);

        }
    }
}
