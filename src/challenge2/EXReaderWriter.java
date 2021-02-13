/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.io.*;
public class EXReaderWriter 
{
    public static void main(String[]args) throws Exception
    {
        
        CharArrayWriter cr=new CharArrayWriter(20);
        cr.write('a');
        cr.write('b');
        cr.write('c');
        cr.write('d');
        cr.write('e');
        cr.write('f');
        
        char  b[]=cr.toCharArray();
        for( char x :b)
        {
            System.out.println(x);
        }
        
        
        /*
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c);
        int x=0;
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
        }
            */
        
        cr.close();
    }

    
}
