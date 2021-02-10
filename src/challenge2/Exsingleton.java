/*
 *Singleton classes are those classes which have only one object
 */
package challenge2;

class coffeemachine
{
    private float coffeeqty;
    private float waterqty;
    static private coffeemachine our=null;
    private coffeemachine()
    {
        coffeeqty=1;
        waterqty=1;
    }
    static public coffeemachine getInstance()     
    {   
        if(our==null)
            our=new coffeemachine();
        return our;
        
    }
}
public class Exsingleton 
{
    public static void main(String[] args)
    {
        coffeemachine c=coffeemachine.getInstance();
        
    }
}
