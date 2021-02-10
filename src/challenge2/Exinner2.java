/*
 anonymous classes are those clases
 which created during object creation;
NOTE >
1* anonymous class can extend only 
   exactly one class and exactly one interface
2* method local inner classes can be marked only by abstract keyword; 
*/
package challenge2;

/*
we can also use interface in place of abstract class
 */
 abstract class My
 {
     abstract void display();
 }
 class Outer
 {
     public void meth()
     {
         My m=new My()
         {
           @Override 
           // overriding method without class name i.e anonymous inner class 
           public void display()
           {
             System.out.println("Hello");  
           }
         };
         m.display();
     }
 }
public class Exinner2 
{
    public static void main(String[] args)
    {
     Outer o= new Outer();
     o.meth();
    }
}
