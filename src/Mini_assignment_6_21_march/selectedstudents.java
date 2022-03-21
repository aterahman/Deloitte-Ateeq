import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class selectedstudents
{
   public static void main(String [] args)throws Exception
   {
       String path = "C:\\Users\\aterahman\\Documents\\Result_list.csv";
       String line = "";


        int i;
       try
       {
           BufferedReader br = new BufferedReader(new FileReader(path));

           while((line=br.readLine()) != null) {
               String[] values = line.split(",");

               int x = 0;
               if (Character.isDigit(values[4].charAt(0))) {
                   x = Integer.parseInt(values[4]);
               }
               if (x > 0 && x <= 5) {
                   System.out.println(values[0] + " " + values[1] + " " + values[2] + values[3] + " " + values[4]);
               }

           }
           String newFileName  = "Temp" + "SelectedStudent";
           File newFile = new File(newFileName);
           BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));

           }



       catch (FileNotFoundException e)
       {
           e.printStackTrace();;
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           e.printStackTrace();
       }


   }
}