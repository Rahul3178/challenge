/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author Rahul
 */
public class ExSchallange 
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("Source.txt");
        FileOutputStream fos2=new FileOutputStream("Source2.txt");
        
        
        String str="java is a programing language";
        String str2="html is not a programing language";
        str=str.toUpperCase();
        fos.write(str.getBytes());
        fos2.write(str2.getBytes());
        FileInputStream fis=new FileInputStream("Source.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        SequenceInputStream sis=new SequenceInputStream(fis,fis2);
        FileOutputStream fos3=new FileOutputStream("Destination.txt");
       
         int x=0;
        while((x=sis.read())!=-1)
        {
          fos3.write(x);
        }
        
        
        
        
       
        
        
        
       sis.close();
        fos.close();
        fos2.close();
        fos3.close();
        fis.close();
        fis2.close();

    }

    
    
}
