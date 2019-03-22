/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuencial;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        
     /*   double radio,longitud,area;
        
        Scanner sc; // Creo la variable
        
        sc = new Scanner(System.in); // Reserva memoria para coger datos
        System.out.println("Introduzca el radio de la esfera: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio);
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la esfera es: " + longitud);
        System.out.println("El área de la esfera es: " + area ); */
     
     double radio,resultado;
        
        Scanner sc; // Creo la variable
        
        sc = new Scanner(System.in); // Reserva memoria para coger datos
        System.out.println("Introduzca el radio de la esfera: ");
        radio = sc.nextDouble();
        System.out.println("La longitud de la esfera es: " + 2 * Math.PI * radio);
        System.out.println("El área de la esfera es: " + Math.PI * Math.pow(radio, 2)); 
        
    }
}
