class MYarray <T>
{
    //T a[]=new T[10];
    @SuppressWarnings("Unchecked")
    T a[]=(T[])new Object[10];
    int length=0;
    
    public void append(T v)
    {
        a[length++]=v;
        
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
class MyArrray<T> extends MYarray<T>
{// if we extends a sub class from generic class the sub class needs to be generic  
}
public class ExGeneric5 
{
    public static void main(String[] args)
    {
        MYarray <Integer> m=new MYarray<>();
        MYarray< String> s=new MYarray<>();
        // we can also pass multiple arguments/data types
        m.append(10);
        m.append(15);
        m.append(16);
        m.display();
        s.append("hello");
        s.append("bye");
        s.display();
    }
    
}
