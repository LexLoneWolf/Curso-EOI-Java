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
public class Meses {
    public static void main(String[] args) {
        
        //int mes;
        
        Scanner sc; // Creo la variable    
        sc = new Scanner(System.in);
        System.out.println("Introduzca el mes en número: ");
        int mes = sc.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("Enero");
               break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("No has metido un número correcto");
                break;            
        }
        
        
        
    }
}
