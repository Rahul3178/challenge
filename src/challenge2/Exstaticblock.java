/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;
class Hondacity
{
    static long price=10;
    int a,b;
    static double onRoad(String city)
    {
        switch(city)
        {
            case "Delhi" : return price+(price*0.1);
                           
            case "Mumbai" : return price+(price*0.09);
        }
        return 0;
    }
}

public class Exstaticblock 
{
public static void main(String[] args)
{
    Hondacity h1=new Hondacity();
    Hondacity h2=new Hondacity();
    System.out.println(h1.price);
    System.out.println(h2.price);
    h1.price=11;
    System.out.println(h1.price);
    System.out.println(h2.price);
}

    
}
