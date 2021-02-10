/*
 in ##method Reference Method is pass as reference to other method 
    with the help of functional interface
 */
package challenge2;

/**
 *
 * @author Rahul
 */
@FunctionalInterface
interface mylambda
{
    public void display(String str);
    /**
     * in this the display function is work like print bcz it have 
     * reference of static method i.e println
     * mylambda m=System.out ::println;
     * in this syntax System is a class and out is a object
     * static method is called by the help of class name;
     * # now display method is work like static reverse method
     * @2 now we also create our own static method and pass as reference 
     * to functional interface
     * 
    */
    
}
class demo1
{
    /**
     * we can also pass non static method as a reference 
     * for this first we have create the object of class where 
     * non static method is available then assign the object to interface object
     * @param str 
     */
     //public static void reverse (String str)
    public  void reverse (String str)
    {
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
            
}

public class Exmethod 
{
    public static void main(String[] args)
    {
      //  mylambda m=System.out ::println;
     // mylambda m=demo1::reverse; //for static method with class name
        demo1 d=new demo1();// for non static methods 
        mylambda m=d::reverse;// for non static methods 
        m.display("hello");
    }
    
}
