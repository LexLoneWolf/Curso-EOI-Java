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
public class Ejercicio1 {
    public static void main(String[] args) {
        
        
       Scanner sc = new Scanner(System.in);
        
        
        
        int N = 5;
        
        char C = 'a';
        
        double A = 4.56;
        
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N + A));
        System.out.println(A + " - " + N + " = " + (A - N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
       }
}
