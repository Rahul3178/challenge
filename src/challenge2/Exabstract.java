/*
 abstract classses;
we cant use final ,Static modifier in abstract class or method bcz
they hinder the overriding mathod;
 */
package challenge2;

abstract class Suuper
{
   Suuper()
   {
       System.out.println("Suuper");
   }
   void meth1()
   {
       System.out.println("Super Meth");
   }
   abstract void method();
}
class Suub extends Suuper
{// this call no anymore abstract class
    //until its override abstract method
    @Override
    void method()
    {
        System.out.println("Override");
    }
}

public class Exabstract 
{
   public static void main(String[] args)
   {
       Suuper s2;// only reference of abstract class
       Suub si=new Suub();// object creates of concrete class 
       si.meth1();
       si.method();
       // we can also use dynamic method dispatch
       // Suuper si=new Suupper();
   }

    
}
