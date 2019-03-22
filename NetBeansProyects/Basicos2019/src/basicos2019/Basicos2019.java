/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos2019;

import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Basicos2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N;
        int modulo;
        Scanner sc; // Creo la variable
        
        
        sc = new Scanner(System.in);   // Reserva memoria para coger datos de la consola
        
        System.out.println("Introduzca un número por pantalla: ");
        N = sc.nextInt();
        System.out.println("Valor inicial de N = " + N);
        N += 77;    // N = N + 77;
        System.out.println("N + 77 = " + N);
        N -= 3;
        System.out.println("N - 3 = " + N);
        N *= 2;
        System.out.println("N * 2 = " + N);
        
        N = 10;
        modulo = 10%3;
        System.out.println("El resto de 10/3 es: " + modulo);
        
        
    }
    
}
