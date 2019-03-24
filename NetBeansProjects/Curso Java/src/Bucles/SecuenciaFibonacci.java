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
public class SecuenciaFibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int a = 0,b = 1,c,n;
        
        System.out.println("introduce un número");
        n = sc.nextInt();
        
        for( int i=0;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
       }
}
