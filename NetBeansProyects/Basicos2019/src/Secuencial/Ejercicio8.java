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
public class Ejercicio8 {

    public static void main(String[] args) {

        double radio,resultado;
        Scanner sc; // Creo la variable    

        sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la esfera: ");
        radio = sc.nextDouble();
        //resultado = (4.0/3) * Math.PI * Math.pow(radio, 3);
        //System.out.println("El volumen de la esfera es: " + resultado);
        System.out.println("El volumen de la esfera es: " + (4.0/3) * Math.PI * Math.pow(radio, 3));
    }

}
