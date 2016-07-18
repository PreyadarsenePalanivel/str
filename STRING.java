/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author Dhaarani
 */
public class STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
   Scanner s=new Scanner(System.in);System.out.println("Enter the String");
   String h=s.nextLine();
        String re = new StringBuffer(h).reverse().toString();
        System.out.println("After procss    "+re);
    }
    
}
        // TODO code application logic here
    
    

