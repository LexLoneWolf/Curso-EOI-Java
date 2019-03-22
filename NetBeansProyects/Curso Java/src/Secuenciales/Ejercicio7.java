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
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double c1, c2; 
        
        System.out.println("Introduce la medida del cateto 1: ");
            c1 = sc.nextDouble();
        
        System.out.println("Introduce la medida del cateto 2: ");
            c2 = sc.nextDouble();
        
        System.out.println("La medida de la hipotenusa es: " + Math.pow(c1, 2.0) + Math.pow(c2, 2.0));
    }
}
