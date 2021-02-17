
package challenge2;


public class Generic2 <T>// this makes class generic type;
{
    T data[]=(T[])new Object[3];
    /*
    its makes an array of object of generic type;
    and without specific datatype define it will take any type of data
    and this is non static method i.e we make a object of it for accessing it
    */
    
    public static void main(String[] args)
    {
        Generic2 <String> gd=new Generic2();
        /*
        this is non static method in main we call object by class name
        and here string represent the Specific type of data it will 
        take only string if we change it integer then it will take
        integer value only;
        */
        gd.data[0]="hii";
        gd.data[1]="bye";
        gd.data[2]="marja";
     //   gd.data[2]=10; now it will show compile tine errors.
       String str=gd.data[0];
        // now there is no  need of type casting;
    
        
        
        
    }

    
}
