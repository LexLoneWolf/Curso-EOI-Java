/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuenciales;

import java.util.Scanner;

/**
 *
 * @author lareo
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Introduzca un número"); 
            int n = sc.nextInt();
            n = Math.abs(n);
        System.out.println("Primera cifra de " + n + " = " + (n/100));
        System.out.println("Segunda cifra de " + n + " = " + (n/10)%10);
        System.out.println("Tercera cifra de " + n + " = " + (n%10));
        
    }
}
