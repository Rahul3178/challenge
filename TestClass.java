import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class TestClass {
    public static void main(String args[] ) 
    {
        Scanner sc=new Scanner(System.in);
        int D,oc,of,od,cs,cb,cm,cd,oflinecost,olcost;
        D=sc.nextInt();
        oc=sc.nextInt();
        of=sc.nextInt();
        od=sc.nextInt();
        cs=sc.nextInt();
        cb=sc.nextInt();
        cm=sc.nextInt();
        cd=sc.nextInt();
        
         olcost=oc+(D-of)*od;
        oflinecost=cb+((D/cs)*cm)+(D*cd);
        
        
        
        if (olcost<=oflinecost)
        {
            System.out.println("Online Taxi");
        }
        else 
        {
            System.out.println("Classic Taxi");
        }   
             

    }
}
