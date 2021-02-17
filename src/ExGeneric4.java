class Myarray <T, K>
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
public class ExGeneric4 
{
    public static void main(String[] args)
    {
        Myarray <Integer,Double> m=new Myarray<>();
        Myarray< String,String> s=new Myarray<>();
        m.append(10);
        m.append(15);
        m.append(16);
        m.display();
        s.append("hello");
        s.append("bye");
        s.display();
    }
    
}
