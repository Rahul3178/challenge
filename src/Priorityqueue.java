import java.util.*;
class Mycom implements Comparator<Integer>
{
    @Override
   public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return -1;// small no high priority
        if(o1>o2) return 1;// large no small priority
        
        return 0;
    }
}
public class Priorityqueue 
{
    public static void main(String[] args)
    {
      PriorityQueue <Integer> p=new PriorityQueue <> (new Mycom());
      p.add(22);
      p.add(33);
      p.add(44);
      p.add(55);
      p.add(66);
      p.add(77);
      p.add(88);
      p.add(99);
      p.add(100);
      p.add(110);
      System.out.println("Give head element"+p.peek());
      p.forEach((x)->System.out.println(x));
    }
}
