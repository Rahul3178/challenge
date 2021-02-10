/*
 inner classes,local inner classes,
 anonymous,or static inner classes
it create two files outer.class ,outer$inner.class;
 */
package challenge2;

/*
 *
 * @author Rahul
 */
class outer
{
    int x=10;
    class inner
    {
// inner class access the outer class variables without creating objects;
        
        int y=20;
        void innerdisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    
    void outerdisplay()
    {
        inner i=new inner();
    // this inner class object helps the outer class to acces inner class variables
        i.innerdisplay();
        System.out.println(i.y);
    }
    /*
local inner classes
*/
    
 void display()
 {
     class Inner
     {
         void Innerdisplay()
         {
             System.out.println("hello");
         }
     }
     Inner I=new Inner();
     I.Innerdisplay();
     
 }
    
}

public class Exinner 
{
   public static void main(String[] args)
   {
       outer o=new outer();
       o.outerdisplay();
       o.display();
       /* we can also use both classes outside */
// outer.inner i=new outer().new inner();

   }
}


