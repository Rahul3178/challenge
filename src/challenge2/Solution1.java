/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

import java.util.Scanner;

public class Solution1 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        if(s.matches("[a-z A-Z]+"))
        {
           for(int i = 0;i<=s.length()-k;i++){
             String subString = s.substring(i,i+k);
             if(i == 0){
                 smallest = subString;
             }
             if(subString.compareTo(largest)>0){
                 largest = subString;
             }else if(subString.compareTo(smallest)<0)
                 smallest = subString;
      }
            
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}