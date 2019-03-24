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
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double r, v;
        System.out.println("Introduzca una longiud de radio: ");
            r = sc.nextDouble();
        System.out.println("El volumen de la esfera es : " + 4.0/3 * Math.PI * Math.pow(r, 3) + " cm2 ");
    }
}
