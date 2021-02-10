/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="";
        for(int j=A.length()-1;j>=0;j--)
        {
             reverse+=A.charAt(j);
             
        }
        if(reverse.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
           
       
        
    }
}




