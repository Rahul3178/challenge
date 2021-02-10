/* 
using of this or super kayword;

*/
package challenge2;

class rectangle
{
  int length;//@2 this reference to this object
  int breadth;
  int x=10;
    rectangle(int length,int breadth)
    {
        this.length=length;// @1 this reference to current object
        this.breadth=breadth;
    }
}
class cuuboid extends rectangle
{
    int height;
    int x =20;
    cuuboid (int l,int b,int h)
    {
        super(l,b);// this super keyword call the Super class
        //constructor which have 2 parameters
        height=h;
    }
    void display()
    {
      System.out.println(super.x);// this always called super class veriable;
      System.out.println(x);
    }
}
public class ExSuper 
{
    public static void main(String[] args)
    {
        cuuboid c=new cuuboid( 20,30,40);
        c.display();
    }
}
