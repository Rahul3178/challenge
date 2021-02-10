/*
 Sum of number usnig method varible arguments;
 */
package challenge2;

/**
 *
 * @author Rahul
 */
public class Sum 
{
  static  int Sum(int... x)
    {
        if(x.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int s=0;
        for(int i=0;i<x.length;i++)
        {
            
            s=s+x[i];
        }
        return s;
    }
    public static void main(String [] args)
    {
       System.out.println(Sum(10,3,4,5,6,7));
        
    }
    
}
