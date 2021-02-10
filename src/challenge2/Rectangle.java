/*
 * Data hiding technique with get or set property ;
 */
package challenge2;
import java.util.Scanner;
public class Rectangle 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        int le=sc.nextInt();
        int be=sc.nextInt();
        rect2 m=new rect2();
        m.setlength(le);
        m.setbreadth(be);
        System.out.println("Area is :"+m.area());
        System.out.println("Perimeter is:"+m.perimeter());
        System.out.println("Squre is:"+m.isSqaure());
        
        System.out.println("get length:"+m.getlength());
        System.out.println("get breadth:"+m.getbreadth());
    }
}
class rect2
{
  private int length;
    private int breadth;
    public int getlength()
    {
        return length;
    }
    public void setlength(int l)
    {
        if(length>=0)
        {
          length=l;  
        }
        else
            length=0;
    }
    public int getbreadth()
    {
        return breadth;
    }
    public void setbreadth(int b)
    {
        if(breadth>=0)
        {
          breadth=b;  
        }
        else
            breadth=0;
    }
    public int area()
    {
        return getlength()*getbreadth();
    }
    public int perimeter()
    {
     return 2*(length*breadth);
        
    }
    public boolean isSqaure()
    {
        if(length==breadth)
        {
           return true; 
        }
        else
            return false;
    }
}