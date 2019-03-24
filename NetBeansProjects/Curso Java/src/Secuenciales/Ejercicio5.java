
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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double r;
        System.out.println("Introduce una longitud de radio");
        r = sc.nextDouble();
        System.out.println("Longitud de la circunferencia = " + 2 * Math.PI * r + "cm");
        System.out.println("Área de la circunferencia = " + Math.PI * Math.pow(r,2) + "cm2" );        
    }
}
