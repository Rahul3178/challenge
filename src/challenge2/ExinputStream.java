/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
import java.io.*;
/**
 *
 * @author Rahul
 */
public class ExinputStream
{
    public static void main(String[] args) throws Exception
    {
      FileInputStream fis=new FileInputStream("Demo.txt");
      byte b[] =new byte[fis.available()];
     /* fis.read(b); //# 1st method which print whole String at a time;
      String str=new String(b);
      System.out.println(str);
      */
     int x = 0;
     while(x!=-1)
     {
        x=fis.read();
        if(x!=-1)
            System.out.print((char)x);
     }
    }
}
