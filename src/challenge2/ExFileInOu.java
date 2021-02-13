/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Producer extends Thread
{
    OutputStream os;
    Producer(OutputStream o)
    {
        this.os=o;
    }
    @Override
    public void run()
    {
        int count=1;
        while(true)
        {
            try {
                os.write(count);
               os.flush();
               System.out.println("Producer"+count);
               count++;
               Thread.sleep(10);
            }
            catch (IOException ex) 
            {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
class Consumer extends Thread
{
    InputStream in;
    Consumer(InputStream i)
    {
        in=i;
    }
    @Override
    public void run()
    {
      int x=0;
      while(true)
      {
          try 
          {
              
              in.read();
              System.out.println("Consumer"+x);
              System.out.flush();
              x++;
              Thread.sleep(10);
          } 
          catch (IOException ex) 
          {
              Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
          } catch (InterruptedException ex) {
              Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
}
public class ExFileInOu 
{
    public static void main(String[]args) throws IOException
    {
        PipedInputStream pi=new PipedInputStream();
        PipedOutputStream po=new PipedOutputStream();
        pi.connect(po);
        Producer d=new Producer(po);
        Consumer c=new Consumer(pi);
        d.start();
        c.start();
    }
    
}
