/*
using inheritaance
*/
package challenge2;

import java.util.Scanner;
public class Sinherit 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:\n");
        String na=sc.nextLine();
        System.out.println("Enter the address:\n");
        String ad=sc.nextLine();
        System.out.println("Enter the Account number:\n");
        String ac=sc.nextLine();
        System.out.println("Enter the phone number:\n");
        String pn=sc.nextLine();
        sc.nextLine();
        Account abc=new Account("Rahul","vpo","203928","03938372728");
        abc.setPhn(pn);
        abc.setadd(ad);
        System.out.println(" Phone number is:\n"+abc.getphn());
        System.out.println(" Address is :\n" +abc.getadd());
        
        
        
        
    }
}

class Account
{
    private String name;
    private String accno;
    private String add;
    private String Phn;
    protected long balance;
    
    public Account(String n,String ad, String ac, String p)
    {
        this.name=n;
        this.Phn=p;
        this.accno=ac;
        this.add=ad;
        balance=0;
    }

    

    
    public String getname(){ return name; }
    public String getphn() { return Phn; }
    public String getaccno() { return accno;}
    public String getadd() { return add; }
    public long getbalance() { return balance; }
    public void setadd(String ad)
    {
        add=ad;
    }
    public void setPhn(String p)
    {
        Phn=p;
    }
    
}

class Saving extends Account
{

    public Saving(String n, String ad, String ac, String p) {
        super(n, ad, ac, p);
    }

    
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}
class loan extends Saving 
{
    
    public loan(String n, String ad, String ac, String p) {
        super(n, ad, ac, p);
    }
    public void payemi(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if (balance==amt)
        {
            balance=0;
        }
    }
}