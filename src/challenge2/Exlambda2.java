/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;


/**
 *lambda Expression using Arguments ;
 * @author Rahul
 */
/*
interface Mylambda2
{
   public int add(int x,int y); 
}
public class ExLambda2 
{
 public static void main(String[] args )
 {
     Mylambda2 ml=(a,b)->{return a+b;};
    System.out.println(ml.add(5, 10));
 }
}
*/
/**
 * methods and local variables inside lambda expression
 */
@FunctionalInterface
interface MyLambda1
{
    public void display();
}
class Demo
{
     int temp=10;// instance variable of a class
    public void method()
    {
       
        int y=0;//method local variable need to be final for use
        MyLambda1 ml=()->
        {
            int count=0;//local variables
            // yes we can create local variables & change values their inside lambda expression;
            System.out.println("hello");
            System.out.println("Bye"+count++);
         //   System.out.println("hii"+y); y++;
         /*
         but we cants use local variables of method inside lambda expression 
         bcz lambda support final variable which valuses cants be change 
         in future
         */
         System.out.println("instance"+temp++);
         /*
         but we can use insatance varibles of a class and also modified it 
         
         */
        };
        ml.display();
    }
}

  public  class Exlambda2
  {
      public static void main(String[] args)
      {
        Demo d=new Demo();
        d.method();
      }
  }
