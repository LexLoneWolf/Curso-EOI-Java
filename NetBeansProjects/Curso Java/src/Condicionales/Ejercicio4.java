
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
public class Ejercicio4 {
    public static void main(String[] args)throws java.io.IOException {
        
    Scanner sc = new Scanner (System.in);
    
    char C,C2;
        System.out.println("Introduzca un carácter");
        C = (char)System.in.read();
        System.in.read();
        System.out.println("Introduzca el segundo carácter");
        C2 = (char)System.in.read();
        
        if(C == C2) {
            System.out.println("Los carácteres introducidos son idénticos");
        }
        else {
            System.out.println("Los carácteres introducidos no son iguales");
        }
    }
}
