/* generic is define in Generic 2 
 *generic 
type safty
compile time error
no type casting
 */
package challenge2;

/**
 *
 * @author Rahul
 */
public class GenericDemo 
{
    public static void main(String[] args)
    {
        //  1@ class object
        Object obj=new String("hello");
        // 2@ array object same problems lets see.
        
        Object arr[]=new Object[3];
        arr[0]="hii";
        arr[1]="bye";
        arr[2]=10;//bcz of this it shows run time errors
        String str;
        for(int i=0;i<3;i++)
        {
           // str=obj[i]; type casting problem;
            str=(String)arr[i];
            System.out.println(str);
            
        }
        
        /* 
        
       @1 there is no #type safty bcz this object can store any type of data value 
        it may be string or interger anything;
     
        */
        obj=new Integer(10);
        /*
        this line not shows compile time error it shows only run time error
        bcz when an object of non String type type casting by 
        string time shows an runtime  error
        */
     //   String str=obj; 
     //it shows an error bcz this object have reference of super class
    // we can't directly assigned it to another for that we need type casting;
        String str1=(String)obj;
        System.out.println(str1);
    
    }
}
