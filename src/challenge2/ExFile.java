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
public class ExFile 
{
    public static void main(String[] args)throws Exception
    {
        File f=new File("Demo.txt");
        System.out.println(f.getName());
         System.out.println(f.getParent());
         System.out.println(f.getPath());
         System.out.println(f.getTotalSpace());
         System.out.println(f.isDirectory());
        File []list =f.listFiles();
         for(File x:list)
         {
             System.out.println(x);
         }
    
    }
    
}
