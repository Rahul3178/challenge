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
public class ExBufferRW 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis=new FileInputStream("Demo.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
       /*
        int x=0;
        while((x=bis.read())!=-1)
        {
          System.out.print((char)x);
        }
            System.out.println("Buffer "+bis.markSupported());
            System.out.println("File "+fis.markSupported());
            */
     //  System.out.println("line"+bis.readLine()); not supported
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(8);
       System.out.print((char)bis.read());
       System.out.print((char)bis.read());
       System.out.print((char)bis.read());
       bis.reset();
       System.out.print((char)bis.read());
       System.out.print((char)bis.read());
       System.out.print((char)bis.read());
       System.out.print((char)bis.read());
       
    
    
    
    
    }


    
}
