/*
constructor with parameter
 */
package challenge2;

import java.util.Scanner;

class cln
{
    private int radius;
    private int height;
    public  cln()// constructor does not have return type
    {
        radius=height=1;
        
    }
    public cln(int r,int h )
    {
        radius=r;
        height=h;
    }
    public int getradius()
    {
        return radius;
    }
    public int getheight()
    {
        return height;
    }
    public void setradius(int r)
    {
        if(r>=0)
            r=1;
        else
            r=0;
    }
    public void setheight(int h)
    {
        if(h>=0)
            h=1;
        else
            h=0;
    }
    public double lidarea()
    {
      return (Math.PI*radius)*radius;  
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumarea()
    {
        return 2*lidarea()+perimeter()*height;
    }
    public double volume()
    {
        return lidarea()*height;
    }
}



public class Cylinder 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and height:\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        cln m=new cln();
        m.setradius(a);
        m.setheight(b);
        System.out.printf("lid Area %.2f \n",m.lidarea());
        System.out.printf("lid Area %.2f \n",m.perimeter());
        System.out.printf("lid Area %.2f \n",m.volume());
        System.out.printf("lid Area %.2f \n",m.drumarea());
        
    }
}
