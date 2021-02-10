/*
 * we also pass constructer as reference with the help of functional interfce
    
 */
package challenge2;

/**
 *
 * @author Rahul
 */
@FunctionalInterface
interface myLambda
{
   // @1  public void display(String s);
    public int display(String s1,String s2);// @2
}
public class Exmethod2 
{
    /* @1
        public Exmethod2(String s)//constructor
    {
       System.out.println("Hello Constructor"+" "+s.toUpperCase());
    }
    */
    public static void main(String[] args)
    {
      /* @1
        myLambda m=Exmethod2::new;
        m.display("my self constructor");
        */
        myLambda ml=String::compareTo;
        System.out.println(ml.display("zell", "well"));
        //here result is +ve 3 because w comes befor z;
    }
}
