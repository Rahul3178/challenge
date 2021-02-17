
public class ExGeneric 
{

    /**
     *
     * @param args
     */
 //   @SuppressWarning("Unchecked")
    public static void main(String [] args)
    {
     Object obj= new String("hi");
     Object obj2[]= new Object[3];
     
     obj2[0]="hi";
     obj2[1]="bye";
     obj2[2]=10;
     
    // obj =new Integer(10);//it only shows run time error.
     String str=(String)obj;
     
     System.out.println(str);
     String str1;
     for(int i=0;i<3;i++)
     {
         str1=(String) obj2[i];
         System.out.println(str1);
         
     }
     
    
    }
    

   
    
}
