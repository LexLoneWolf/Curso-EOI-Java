/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Profesor
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        char letra;

        Scanner sc; // Creo la variable    
        sc = new Scanner(System.in);
        System.out.println("Introduce una tecla: ");
        letra = sc.next().charAt(0);
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("Es mayúscula");
        } 
        else if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es minúscula");
        }
        else if (letra =='.'){
            System.out.println("Es un punto");
        }
        else {
            System.out.println("Es otra cosa");
        }

    }

}
