/*
 *problem solution game;
    i want to store object of a class into a file;
 */
package challenge2;

import java.io.*;
class STudent
{
   int rollno;
   String name;
   String dept;
}

    /*
        this is the first solution of the problem
    
    */
public class ExSerialization 
{
    /*
    public static void main(String[] args) throws FileNotFoundException
    {
       FileOutputStream fo=new FileOutputStream("my.txt");
       /*
    //   we use printStream;
       
       PrintStream p=new PrintStream(fo);
       STudent s=new STudent();
       s.rollno=10;
       s.dept="cse";
       s.name="jonh";
       p.println(s.rollno);
       p.println(s.name);
       p.println(s.dept);
       /*
       it takes int as a string at the time of reading we need to type 
       converter 
       /
       
       
    }
        */
    
    public static void main(String[] args) throws Exception
    {
        FileInputStream fi=new FileInputStream("my.txt");
        //problem  we need string buffer here bcz file input string cant read a string;
        BufferedReader br=new BufferedReader(new InputStreamReader(fi));
        STudent s=new STudent();
        s.rollno=Integer.parseInt(br.readLine());
        // problem convert string to integer;
        s.dept=br.readLine();
        s.name=br.readLine();
        System.out.println(s.rollno+" "+s.name+" "+s.dept );
        
        
    }
    
    
}
