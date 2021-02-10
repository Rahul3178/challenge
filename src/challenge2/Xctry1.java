/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

/* Exception propogation 
 */
class uncheck
{
    void meth1()
    {
     
        try
        {
           
            int r=meth2(2,0);
            System.out.println(r);
        
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
    }
    int meth2(int a,int b) throws Exception
    {
        if(a<=0 && b<=0)
        {
         throw new Exception(" negative numbers are not allowed");   
        }
        int c;
        c=a/b;
        
        return c;
        
    }
}
public class Xctry1 
{
   public static void main(String[] args)
   {
       uncheck u=new uncheck();
       u.meth1();
   }
}
