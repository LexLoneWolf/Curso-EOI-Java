/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author lareo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
            int n;
        
        System.out.println("Introduzca un número entero: ");
            n = sc.nextInt();
        
        if(n%10==0) {
            System.out.println("El número es múltiplo de 10");
        }
        else {
            System.out.println("El número no es múltiplo de 10");
        }
    }
}
