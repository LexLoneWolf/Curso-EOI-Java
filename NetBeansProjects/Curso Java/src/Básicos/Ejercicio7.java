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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int C = 100, D = -150;
        
        System.out.println(C + (C >= 0 ? " es positivo" : " es negativo"));
        System.out.println(C + (C%2== 0 ? " es par" : " es impar "));
        System.out.println(C + (C%5== 0 ? " es múltiplo de 5" : " no es múltiplo de 5"));
        System.out.println(C + (C%10== 0 ? " es múltiplo de 10" : " no es múltiplo de 10 "));
        System.out.println(C + (C >= 100 ? " es mayor que 100" : " es menor que 100"));
//        System.out.println(D + (D >= 0 ? " es positivo" : " es negativo"));
//        System.out.println(D + (D%2== 0 ? " es par" : " es impar "));
//        System.out.println(D + (D%5== 0 ? " es múltiplo de 5" : " no es múltiplo de 5"));
//        System.out.println(D + (D%10== 0 ? " es múltiplo de 10" : " no es múltiplo de 10 "));
//        System.out.println(D + (D >= 100 ? " es mayor que 100" : " es menor que 100"));

    }
}
