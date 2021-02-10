/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

class Test3
{
    void Test3()
    {
        System.out.print("method");
    }
   static 
    {
        System.out.println("block 1");
    }
    static
    {
        System.out.println("Block 2");
    }
    
}
public class Exstatic3 
{
    public static void main(String[] args)
    {
        Test3 t=new Test3();
        t.Test3();
        System.out.println("main");
    }
}
