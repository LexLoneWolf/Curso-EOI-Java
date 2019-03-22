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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        int A = 9, B = 26;
      
        System.out.println(A + (A%2==0 ? " es par " : " es impar"));
        System.out.println(B + (B%2==0 ? " es par " : " es impar"));
          
        
    }
}
