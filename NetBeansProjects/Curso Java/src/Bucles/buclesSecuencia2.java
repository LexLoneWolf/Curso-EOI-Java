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
public class buclesSecuencia2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int a = 1,b,n;
        System.out.println("");
        n = sc.nextInt();
        
        for (int i=0;i<=n;i++) {
            b = a * 2;
            a = b;
            System.out.println(a);
        }
    }
}


// 1 2 4 8 16 32 64 