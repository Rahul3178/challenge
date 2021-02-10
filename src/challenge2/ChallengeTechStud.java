/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

class whiteBoard
{
  String text;
 int numberofstudents=0;
 int count=0;
 public void attendance()
 {
     numberofstudents++;
 }
 synchronized public void write(String t)
 {
     System.out.println("Teacher is writing"+t);
     while(count!=0)
        try{wait();}catch(Exception e){}
     text=t;
     count=numberofstudents;
     notifyAll();
 }
 synchronized public  String read()
 {
     while(count==0)
     {
         try{wait();}catch(Exception e){}
     }
     String t=text;
     count--;
     if(count==0)
     {
         notifyAll();
     }
     return t;
     
 }
    
    
}
class teacher extends Thread
{
    whiteBoard wb;
    String notes[]={"Java is a programing language","its opp","It is platform independent","Its supports thread","end" };
    public teacher(whiteBoard w)
    {
        wb=w;
    }
    @Override
    public void run()
    {
        for(int i=0;i<notes.length;i++)
        {
            wb.write(notes[i]);
            
        }
    }
    
}
class Student1 extends Thread
{
    String name;
    whiteBoard wb;
   public Student1(String n, whiteBoard w)
    {
       name=n;
       wb=w;
       
    }
    @Override
   public void run()
   {
    String text;
    wb.attendance();
    do
    {
        text=wb.read();
        System.out.println(name+ "Reading"+text);
        System.out.flush();
    }while(!text.equals("end"));
    
   }
}

public class ChallengeTechStud 
{
    public static void main(String[] args)
    {
        whiteBoard wb=new whiteBoard();
        teacher t=new teacher(wb);
        Student1  s1=new Student1("1. John",wb);
        Student1  s2=new Student1("2. asif",wb);
        Student1  s3=new Student1("3. rahul",wb);
        Student1  s4=new Student1("4. deepak",wb);
        Student1  s5=new Student1("5. ankit",wb);
        Student1  s6=new Student1("6. gandhi",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
    }
    
}
