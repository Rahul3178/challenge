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
public class ExByteArrayOutput 
{
    public static void main(String[] args) throws IOException
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('A');
        bos.write('b');
        bos.write('c');
        bos.write('d');
       /* first method
        byte b[]=bos.toByteArray();
        for(byte x:b)
        {
            System.out.println(x);
            System.out.println((char) x);
        }
*/
       // 2nd method
       bos.writeTo(new FileOutputStream("re.txt"));
        bos.close();
        
    }
    
    
}
