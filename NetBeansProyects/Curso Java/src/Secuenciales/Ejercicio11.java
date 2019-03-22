/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secuenciales;

import java.util.Scanner;

/**
 *
 * @author lareo
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int N;
        System.out.println("Introduce un número de 5 cifras");
            N = sc.nextInt();
        System.out.println(N/10000);
        System.out.println(N/1000);
        System.out.println(N/100);
        System.out.println(N/10);
        System.out.println(N/1);
    }
}
