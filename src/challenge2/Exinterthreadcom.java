/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

class myData
{
    int value=0;
    boolean flag=true;
    synchronized void set(int v)
    {   
        while(flag!=true)
        {
           
            try
            {
                wait();
            }
            catch(Exception e)
            {
                
            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized int get()
    {
        int x=0;
        while(flag!=false)
        {
            try
            {
                wait();
            }
            catch(Exception e){ }
        }
        x=value;
        flag=true;
        notify();
        return value;
    }
}
class producer extends Thread
{
    myData d;
    producer (myData dat)
    {
        d=dat;
    }
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            d.set(i);
            System.out.println("producer"+i);
            i++;
        }
    }
}
class consumer extends Thread
{
    myData d;
    consumer(myData dat)
    {
        d=dat;
    }
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("consumer"+d.get());
        }
    }
}
public class Exinterthreadcom 
{
   public static void main(String[] args)
   {
       myData data=new myData();
       producer p=new producer(data);
       consumer c=new consumer(data);
       p.start();
       c.start();
       
   }
     
}
