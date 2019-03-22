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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double c, f;
        System.out.println("Introduce una temperatura en grados Celsius");
        c = sc.nextInt();
        f = 32 + (9 * c / 5);
        System.out.println(c + " ºC " + f + " ºF ");
    }
}
