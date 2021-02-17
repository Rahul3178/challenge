package challenge2;
/*
Serialization is a process of storing a state of an object and 
reteriving the state of an object. 
*/


import java.io.*;


class STUDent implements Serializable 
{
   int rollno;
   String name;
   String dept;
}

    /*
        this is the first solution of the problem
    
    */
public class ExSerialization3 
{
    
    public static void main(String[] args) throws Exception
    {
       FileOutputStream fo=new FileOutputStream("my2.txt");
       
    //   we use Objectinput outputStream;
       
       ObjectOutputStream oos=new ObjectOutputStream(fo);
       STUDent s=new STUDent();
       s.rollno=10;
       s.dept="cse";
       s.name="jonh";
       oos.writeObject(s);
       
       
    }
       
  
    /*
    public static void main(String[] args) throws Exception
    {
      FileInputStream fi=new FileInputStream("my2.txt");
       
    //   we use Object input outputStream;
       
       ObjectInputStream ois=new ObjectInputStream(fi);
       STUDent s=new STUDent();
       s=(STUDent)ois.readObject();
       System.out.println(s.rollno+" "+s.name+" "+s.dept);
        
    }
    */
}       
