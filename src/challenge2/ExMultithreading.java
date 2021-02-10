/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
class MyData
{
   synchronized public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
class Mythread1 extends Thread
{
    MyData d;
    Mythread1(MyData dat)
    {
        d=dat;
    }
    @Override
    public void run()
    {
        d.display("Hello world");
    }
}
class Mythread2 extends Thread
{
    MyData d;
    Mythread2(MyData dat)
    {
        d=dat;
    }
    @Override
    public void run()
    {
        d.display("Welcome");
    }
    
}

public class ExMultithreading 
{
    public static void main(String[] args)
    {
        MyData data=new MyData();
        Mythread1 t1=new Mythread1(data);
        Mythread2 t2=new Mythread2(data);
        t1.start();
        t2.start();
    }
    
}
