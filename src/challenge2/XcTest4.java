/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

/**
 *
 * @author Rahul
 */
public class XcTest4 
{
    public static void main(String[] args)
    {
        int a,b,c;
        try
        {
            a=10;
            b=5;
            c=a/b;
            System.out.println("Result is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero"+e);
        }
    }
}
