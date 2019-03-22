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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N;
        System.out.println("Introduce un número de 5 cifras");
        N = sc.nextInt();
        System.out.println(N%10);
        System.out.printf("%02d %n",N%100);
        System.out.printf("%03d %n",N%1000);
        System.out.printf("%04d %n",N%10000);
        System.out.printf("%05d %n",N);
    }
}
