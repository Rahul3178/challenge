class genericdemo <T>
{
    T data[]=(T[]) new Object[3];
}
public class ExGeneric2 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("Unchecked")
        genericdemo < String> gd=new genericdemo <>();
     System.out.println(gd.data[0]="hello");   
        gd.data[1]="bye";
      //  gd.data[2]=new Integer(10);
        gd.data[3]="welcome";
        String str=gd.data[0];
        System.out.println(str);
    }
    
}
