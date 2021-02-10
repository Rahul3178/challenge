/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
/**
 * functional interface are those interface which have only one abstract 
 * function
 * @author Rahul
 */
@FunctionalInterface
interface Mylambda
{
    public void display();// by default Public +adstract;
}
public class ExLambda 
{
    public static void main(String[] args)
    {
       Mylambda ml=new Mylambda(){
           // this is anonymous inner class which override the display function
         public void display()
         {
             System.out.println("2nd method");
         }
       }; 
     //   Mylambda ml =()->{System.out.println("hello");};
        /**
         * here Mylambda holding reference of object (ml)
         * this is (->) lambda signature and this is () method 
         * lambda expresion use the anonymous class/function/method;
         * 
         */
        
        ml.display();
    }
}
