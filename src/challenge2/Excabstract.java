/*
 
 */
package challenge2;

abstract class Shape
{
    abstract void perimeter();
     abstract void area(); 
 
}
class Circle extends Shape
{
  int radius;
  
  Circle(int r)
  {
      this.radius=r;
      
  }
  @Override
  void perimeter()
  {
      System.out.println("Circle perimeteris:\n"+2*Math.PI*radius);
  }
  @Override
  void area()
  {
      System.out.println("Area is:\n"+Math.PI*radius*radius);
  }

}
class rrectangle extends Shape
{
    int length;
    int breadth;
    rrectangle(int l,int b)
    {
        this.length=l;
        this.breadth=b;
    }
    @Override
    void perimeter()
    {
        System.out.println("Rectangle Perimeter is:\n"+2*(length+breadth));
       
    }
    @Override
    void area()
    {
        System.out.println("Rectangle area is:\n"+length*breadth);
    }
}
public class Excabstract 
{
    public static void main(String[] args)
    {
        rrectangle r=new rrectangle(10,15);
        Circle c=new Circle(10);
        c.area();
        c.perimeter();
        r.area();
        r.perimeter();
    }
}
