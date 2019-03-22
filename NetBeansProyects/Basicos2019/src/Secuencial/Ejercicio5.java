/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        double radio,resultado;
        Scanner sc; // Creo la variable    

        sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble();
        System.out.println("La longitud de la circunferencia es: " + 2 * Math.PI * radio);
        System.out.println("El area de la circunferencia es: " + Math.PI * Math.pow(radio,2));
    }
    
}
