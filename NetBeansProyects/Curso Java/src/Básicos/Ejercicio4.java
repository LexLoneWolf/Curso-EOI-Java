/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Básicos;

import java.util.Scanner;

/**
 *
 * @author lareo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        int A = 3, B = 1, C = 5, D = 7, AUX;
        
        System.out.println("Valores Iniciales:");
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        
        System.out.println("Valores Finales:");
        
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);
        
        
        
        


    }
}
