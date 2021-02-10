/*
 * nested try and catch block
 */
package challenge2;

/**
 *
 * @author Rahul
 */
public class XcTest1 
{
    public static void main(String[] args)
    {
   try
   {
       int a[]={10,0,8,7,5,3};
   
   int r;
   r = a[0]/a[2];
   System.out.println(r);
   System.out.println(a[10]);
   }
   catch(ArithmeticException e)
   {
       System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println(e);
   }
    }
    
}
