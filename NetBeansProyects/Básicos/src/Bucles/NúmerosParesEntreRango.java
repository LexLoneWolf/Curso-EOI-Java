/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NúmerosParesEntreRango {
    
    public static void main(String[] args) {
        
        Scanner sc; // Creo la variable
        
        sc = new Scanner(System.in); // Reserva memoria para coger datos
        
        System.out.println("Introduzca el número de inicio");
        int inicio = sc.nextInt();
        System.out.println("Introduzca el número de fin");
        int fin = sc.nextInt();
        for (int i=inicio;i<=fin;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
