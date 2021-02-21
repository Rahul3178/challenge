import java.util.*;
public class Linkedlistdemo 
{
    public static void main(String[] args)
    {
        LinkedList <Integer> a1=new LinkedList<>();
        LinkedList <Integer> a2=new LinkedList<>();
        a1.add(10);
        a1.add(5);
        a1.add(50);
        a1.add(25);
        a1.add(35);
        a1.add(15);
        a1.add(20);
        a2.add(30);
        a2.add(45);
        a2.add(1);
        a2.add(22);
        a2.add(17);
        a2.add(8);
        a2.add(7);
        a1.addFirst(0);
        a2.addLast(00);
        a1.addAll(a2);
        
        System.out.print(a1+" ");
        System.out.println("contains 25 or not "+a1.contains(25));
        a1.add(0,2);
        System.out.println("index of 25 "+a1.indexOf(25));
        System.out.println(a1.get(0));
        a1.set(6, 100);
       // System.out.println(a1);
        a1.forEach(n->System.out.println(n));
        a2.forEach(n->System.out.println(n));
     
        
        // iteration through array list;
      /*
        System.out.println("Print through for loop");
        for(int i=0;i<a1.size();i++)
        {
         //   System.out.println(a1[i]); its shows an error;
            System.out.println(+a1.get(i));
        }
        System.out.println("using for each loop");
        for(Integer x:a1)
        {
            System.out.println(x);
        }
        System.out.println("Using iterator");
        Iterator <Integer> ig=a1.iterator();
        while(ig.hasNext())
        {
            System.out.println(ig.next());
        }
        System.out.println("List Iterator");
        
        ListIterator <Integer> it=a1.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.println("using forr loop with list iterator");
        for(ListIterator <Integer> i=a1.listIterator();i.hasNext();)
        {
            System.out.println(i.next());
        }
        System.out.println("for each method for array list");
        a1.forEach(n->System.out.println(n));
        */
    }
}

