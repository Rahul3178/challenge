/*
 Automatic roll number generator this can be achieve
with the help of automatic roll no. generator 
 */
package challenge2;
import java.util.Date;
/*
 */
class Student
{
    private String rollno;
    private static int count=1;
    private String generateRollno()
    {   
        Date d=new Date();
        
        String rn="Univ"+"-"
                + ""+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    public Student()
    {
        rollno=generateRollno();
    }
    public String getrollno()
    {
        return rollno;
    }
    
}
public class Exrollno 
{
    public static void main(String[] args)
    {
        
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        System.out.println("1\n"+s1.getrollno());
        System.out.println("2\n"+s2.getrollno());
        System.out.println("3\n"+s3.getrollno());
        System.out.println("4\n"+s4.getrollno());
        System.out.println("5\n"+s5.getrollno());
    }

    
}
