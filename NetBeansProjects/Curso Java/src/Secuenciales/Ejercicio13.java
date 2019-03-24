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
public class Ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int D,M,A,F,S,cifra1,cifra2,cifra3,cifra4;
        System.out.println("Introduce un día");
            D = sc.nextInt();
        System.out.println("Introduce un mes");
            M = sc.nextInt();
        System.out.println("Introduce un año");
            A = sc.nextInt();
        
        F = (D+M+A);
        cifra1 = F/1000;
        cifra2 = F/100%10;
        cifra3 = F/10%10;
        cifra4 = F%10;
        
        S = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su numero de la suerte es: " + S);
    }
}
