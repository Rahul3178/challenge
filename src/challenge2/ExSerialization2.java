/*
 *solution 2
 */
package challenge2;

import java.io.*;
class STUdent
{
   int rollno;
   String name;
   String dept;
}

    /*
        this is the first solution of the problem
    
    */
public class ExSerialization2 
{
    /*
    public static void main(String[] args) throws Exception
    {
       FileOutputStream fo=new FileOutputStream("my1.txt");
       
    //   we use data input outputStream;
       
       DataOutputStream p=new DataOutputStream(fo);
       STUdent s=new STUdent();
       s.rollno=10;
       s.dept="cse";
       s.name="jonh";
       p.writeInt(s.rollno);
       p.writeUTF(s.name);
       p.writeUTF(s.dept);
       // utf unicode transformation format
      
       // problem in this we write have to write code seprately for each 
      // datatype  output of file in found in binary format
       
    }
        */
    public static void main(String[] args) throws Exception
    {
      FileInputStream fi=new FileInputStream("my1.txt");
       
    //   we use data input outputStream;
       
       DataInputStream p=new DataInputStream(fi);
       STUdent s=new STUdent();
       s.rollno=p.readInt();
       s.dept=p.readUTF();
       s.name=p.readUTF();
       System.out.println(s.rollno+" "+s.name+" "+s.dept);
        
    }
}       
