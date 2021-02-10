
package challenge2;


public class Challenge2 
{   
    
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }
    
    
    public static void main(String[] args) 
    {   String str="Rahul Kumar";
        int n= 15;
        Challenge2 t=new Challenge2();
       
        
        System.out.println( t.validate(str));
        System.out.println(t.validate(n));
        
        
    }
    
}
