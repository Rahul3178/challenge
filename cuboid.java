import java.util.Scanner;
public class cuboid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float l,b,h,v,a,af,au,al;
         System.out.println("|---------------------|");
        for (int n=1; n<=5;n++)
        {
            System.out.println("|                     |");
            
        }
        System.out.println("|---------------------|");
        System.out.println("Enter the lenght,Breadth,height of a cuboid:");
        l=sc.nextFloat();
        b=sc.nextFloat();
        h=sc.nextFloat();
        af=l*h;
        au=l*b;
        al=h*b;
        v=(l*b)*h;
        a=af+au+al;
        System.out.println("Total Area of cuboid :"+a);
        System.out.println("Volume of cuboid:"+v);
        System.out.println("Area of front/back side :"+af);
        System.out.println("Area of upper/lower side :"+au);
        System.out.println("Area of Left/Rightside :"+al);
    }
    
}
