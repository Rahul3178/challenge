/*
 can we pass lambda Expression as an parameter to a method ?
or can we send method as object?
yes yes we can
 */
package challenge2;

/**
 *
 * @author Rahul
 */
@FunctionalInterface
interface Mylambda3
{
    public void display();
}
class uselambda
{
    public void calllambda(Mylambda3 ml)
    {
        ml.display();
    }
}
class demo
{
    public void method()
    {
        uselambda ul=new uselambda();
        ul.calllambda(()->{System.out.println("Hello");});
    }
}
public class Exlambda3 
{
    public static void main(String[] args)
    {
        demo d=new demo();
        d.method();
    }
}
