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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
        double a,b,c,p;
        
        System.out.println("Introduzca la longitud del lado A: " );
            a = sc.nextDouble();
        System.out.println("Introduzca la longitud del lado B: " );
            b = sc.nextDouble();
        System.out.println("Introduzca la longitud del lado C: " );
            c= sc.nextDouble();
            p = (a+b+c)/2;
            
            
        System.out.println("El área del triangulo es: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    
}
