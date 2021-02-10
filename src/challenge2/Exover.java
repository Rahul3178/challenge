/*
 Dynamic method dispatch( Run time polymorphism using Method
overriding in in heritance;
final Static keyword can't use in overriding,
also sub classes can't be private ;sub class 
may be protected or public
 */
package challenge2;

class Super
{
    public void Meth1(){// this method is shadowed bcz
        // method calling based on object not the reference 
       // i.e it's overrided by base class
       System.out.println("This is super class meth 1"); 
    }

}
class Sub extends Super
{
    @Override
    public void Meth1()
    {
        System.out.println("this is Sub class meth 1");
    }
    public void Meth2()
    {
        System.out.println("this is Sub class meth2");
    }
    
}
public class Exover 
{
    public static void main(String[] args)
    {
       Super su=new Sub();// Dynamic method Dispatch
       /*
       Super class reference holding the object of base/sub class
       and when overridden method is called then method of object 
       is called not the method of reference is called.
       */
       // new object created at run time i.e run time run time polymorphsm
       
       su.Meth1();
       // su.Meth2();// we can't call this method because
       //it does not have reference in super classs
    }
}
