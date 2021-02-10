
package challenge2;
import java.util.Scanner;
public class Member 
{
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
     //  sc.nextInt();
      
       System.out.println("Enter the radius of circle:");
       double num=sc.nextInt();
       circle m=new circle();
       m.radius=num;
      
       System.out.println("Area is \n"+m.area());
       System.out.println("perimeter \n"+m.perimeter());
       
       
       
       
    } 
    
}

 class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return (2*Math.PI)*radius;
    }
    
}
