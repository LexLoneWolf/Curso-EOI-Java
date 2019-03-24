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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        int B = 10, C = -2;
        System.out.println(B + (B >= 0 ? " es positivo " : " es negativo"));
        System.out.println(C + (C >= 0 ? " es positivo " : " es negativo"));
    }
}
