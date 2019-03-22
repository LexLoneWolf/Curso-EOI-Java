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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double v;
        
        System.out.println("Introduce una velocidad en Km/h");
        v = sc.nextDouble();
        System.out.println(v + "Km/h es igual a " + (v * 1000/3600 + "m/s "));

    }
}
