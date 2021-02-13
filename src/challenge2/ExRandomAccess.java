
package challenge2;

import java.io.*;

public class ExRandomAccess 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile r=new RandomAccessFile("Demo.txt","rw");
        // here demo text file already created we just use it.
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        r.seek(3);
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        r.write('E');
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        r.skipBytes(3);
        System.out.print((char)r.read());
        System.out.print((char)r.read());
        System.out.println(r.getFilePointer());
        
        
    }
    
}
