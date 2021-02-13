/*
 
 */
package challenge2;
import java.io.*;
/**
 *
 * @author Rahul
 */
public class ExByteArrayInput 
{
    public static void main(String[] args) throws IOException
    {
        byte b[]={'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bar=new ByteArrayInputStream(b);
        int x=0;
        while((x=bar.read())!=-1)
        {
            System.out.print((char) x);
        }
        System.out.println(" "+bar.markSupported());
        bar.close();
        
    }
}
