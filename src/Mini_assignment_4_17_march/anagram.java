import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

        class anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = sc.nextLine();
        System.out.println("Enter string 2");
        String str2 = sc.nextLine();
        int i;
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<Character> charList1 = new ArrayList<Character>();
        for(i = 0; i<str1.length();i++){
            charList1.add(str1.charAt(i));
        }

        ArrayList<Character> charList2 = new ArrayList<Character>();
        for(i = 0; i<str2.length();i++){
            charList2.add(str2.charAt(i));
        }

        Collections.sort(charList1);
        Collections.sort(charList2);
        if(charList1.equals(charList2))
            System.out.println("Anagram");
        else
            System.out.println("no");

    }
}