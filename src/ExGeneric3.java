class Data<T>
{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
}
public class ExGeneric3 
{
    public static void main(String[] args)
    {
        
        Data <Integer> d= new Data<Integer> ();
        d.setData(10);
        System.out.println(d.getData());
    }
    
}
