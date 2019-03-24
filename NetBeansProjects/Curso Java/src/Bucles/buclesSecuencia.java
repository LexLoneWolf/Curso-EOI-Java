/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author lareo
 */
public class buclesSecuencia {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        int a=0,b,c,d,n;
        
        System.out.println("");
        n = sc.nextInt();
        
        for (int i=0;i<=n;i++){
            
           b = a * 3; 
           c = b +1;
           d = c
           a = c;
           
            System.out.println(a);
        }
            
        
    }
}
