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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n;
        
        System.out.println("Introduce un número");
        n = sc.nextInt();
        System.out.println("Número introducido" + n);
        System.out.println("Doble del número introducido " + (2 * n));
        System.out.println("Triple del número introducido " + (3* n));
    }
}