/*
 Interface challange 
 */
package challenge2;

/**
 *
 * @author Rahul
 */
interface member 
/* interface just like abstract classes  uses for
//inheritance or polymorphism purpose but interface only 
//for polymorphism
        private method only usefull inside interface 
        or default method 
// default method uses to modify existing interface its does 
        not affect the other classes ;
        private void meth2()
    {
        System.out.println("Private");
    }
        default void meth5()
        {
        meth(2);
        }
        
*/
{
    int X=10; //only capital letters
    void callback();
// those method by default are abstract or public 
// we dont need to mention them.
    public static boolean meth1()
    {
       System.out.println("Static method allowed in interface only when the "
               + "have defination"); 
       return true;
    }
    
}
class customer implements member
{
 String name;
customer(String h)
{
    name=h;
}
 @Override
public void callback()
{
  System.out.println("OK i will visit to store\n"+name);  
}
}
class store
{
    member mem []=new member[100];
    int count=0;
    void register(member m)
    {
        mem[count++]=m;
    }
    void invitesale()
    {
      for(int i=0;i<count;i++)
      {
          mem[i].callback();
      }
    }
    
    
}
public class Exinterface 
{
    public static void main(String args[])
    {
        store s=new store ();
        customer c1=new customer("Rahul");
        customer c2=new customer("Ankit");
        s.register(c1);
        s.register(c2);
        s.invitesale();
        System.out.println("Static member \n"+ member.meth1());
        System.out.println("Static method does not need object the called by Interface name /n"+member.X);
    }
}
