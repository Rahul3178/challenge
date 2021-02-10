/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

class lowBalanceException extends Exception
{
    @Override
    public String toString()
    {
        return "Balance Should not be lass than 50000";
    }
}
class uncheckchecked
{
    static void fun1()
    {
        try
        {
            throw new lowBalanceException();
        }
        catch(lowBalanceException e)
        {
          System.out.println(e);  
        }
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
}
public class Xctry 
{
    public static void main(String[] args)
    {
        uncheckchecked.fun3();
    }

    
}
