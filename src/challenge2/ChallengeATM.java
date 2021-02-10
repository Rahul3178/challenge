/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.util.logging.Level;
import java.util.logging.Logger;

class ATM
{
   synchronized public void checkBalance(String name)
    {
        System.out.print(name + " Checking ");
       
       try{Thread.sleep(1000);}catch(Exception e){}
       
       System.out.println("Balance");
    }
  synchronized  public void withdraw(String name,int amount)
    {
        
        System.out.print(name + " withdrawing "); 
        
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
    }
}
class customer1 extends Thread
{   String name;
    int amount;

     ATM a;
   customer1(ATM atm,String name,int amount)
   {
       a=atm;
       this.name=name;
       this.amount=amount;
   }
   public void useAtm()
   {
       a.checkBalance(name);
       a.withdraw(name, amount);
   }
@Override
   public void run()
   {
       useAtm();
   }
}
public class ChallengeATM 
{
    public static void main(String[] args)
    {
    ATM atm=new ATM();
    customer1 c= new customer1(atm,"Rahul",12345);
    customer1 c1= new customer1(atm,"amit",3178);
    customer1 c2= new customer1(atm,"ankit",345);
    customer1 c3= new customer1(atm,"deepak",1345);
    c.start();
    c1.start();
    c2.start();
    c3.start();
    }
}
