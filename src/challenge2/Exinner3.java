/*
 Static inner classes;


 */
package challenge2;

/*
 */
class OUTER
{
    static int x=10;
    int y=20;
    static class INNER
    {
        void display()
        {
            System.out.println(x);
          //  System.out.println(y);
          // Static class cant acces non static variables /members;
        }
    }
}
public class Exinner3 
{
    public static void main(String[] args)
    {
     OUTER.INNER I=new OUTER.INNER();
     I.display();
     // here only  inner class object is created;
     /*
     we can directly access static inner class outside
     the outer  class without creating outer class object
     how to create outer class object with inner class object 
     look at this;
     OUTER.INNER I=new OUTER().new INNER(); 
     */
    }
}
