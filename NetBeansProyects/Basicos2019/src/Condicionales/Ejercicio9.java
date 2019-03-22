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
public class Ejercicio9 {

    public static void main(String[] args) {

        int H, M, S;

        Scanner sc; // Creo la variable    
        sc = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        H = sc.nextInt();
        System.out.println("Introduzca los minutos: ");
        M = sc.nextInt();
        System.out.println("Introduzca los segundos: ");
        S = sc.nextInt();
        
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60){
            System.out.println("La hora es válida");
        }
        else{
            System.out.println("La hora no es válida");
        }

    }

}
