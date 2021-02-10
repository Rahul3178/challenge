/*
find the latgest number using method Variable argument Passing
 */
package challenge2;
import java.util.Scanner;
/**
 *
 * @author Rahul
 */
public class Max 
{
  int Max(int ...a)
   {
       if (a.length==0)
       {
           return Integer.MIN_VALUE;
       }
       int m=a[0];
       for(int i=0;i<a.length;i++)
       {
           if(m<a[i])
           {
               m=a[i];
           }
       }
       return m;
   }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Max t=new Max();
     System.out.println(t.Max(new int[]{2,4,6,8}));
      int c= t.Max(a,b);
        System.out.println("Maximun no. is\n"+c);
    }
    
    
}
