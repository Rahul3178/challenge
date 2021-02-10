/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

/**
 *
 * @author Rahul
 */
import java.io.*;

public class ExoutStream 
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("Test.txt");
            String str ="Java Is a programing language";
            FileWriter fw=new FileWriter("Demo.txt");
            String str1="Html is not a programing language";
            /*
            fos.write(str.getBytes()); #1 method getBytes returns 
            array of bytes form string
            
          */
         // # 2nd method is.
         byte b[]=str.getBytes();
       //  fos.write(b);// we can also use for loop for this;
         fos.write(b, 6, str.length()-6);
         fw.write(str1);
        
            fos.close();
            fw.close();
            
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
