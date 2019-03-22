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
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc; // Creo la variable    
        sc = new Scanner(System.in);
        System.out.println("Introduzca el mes en número: ");
        int mes = sc.nextInt();

        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(mes==1){
                        System.out.println("Enero");
                                               
                    }
                    if(mes==3){
                        System.out.println("Marzo");
                    }
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;

                default:
                    System.out.println("No has metido un número correcto");
                    break;
            }
        }
        else{
            System.out.println("El mes es incorrecto"); 
        }
    }
}
