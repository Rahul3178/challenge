/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

class Test2
{
  static int x=10;
    int y=20;
    void Show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
    }
}
public class Exstatic2 
{
    public static void main(String[] args)
    {
        Test2 t1= new Test2();
        t1.Show();
       Test2.display();
        Test2.x=30;
        t1.y=40;
        t1.Show();
        Test2.display();
    }
    
    
}
