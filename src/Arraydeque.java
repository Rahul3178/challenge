import java.util.*;
public class Arraydeque 
{
   public static void main(String[] args)
   {
       ArrayDeque <Integer> dq= new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(12);
        dq.offerLast(14);
        dq.offerLast(15);
        dq.offerLast(16);
        // last in first out // stack
        dq.pollLast();
        dq.forEach((x)->System.out.println(x));
        System.out.println("print");
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerFirst(5);
        dq.offerFirst(6);
        dq.offerFirst(7);
        // it is like queue first in first out;
        dq.pollFirst();
        dq.forEach((x)->System.out.println(x)); 
        
   }
}
