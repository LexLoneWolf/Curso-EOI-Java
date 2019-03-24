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
public class Ejercicio3 {
    public static void main(String[] args)throws java.io.IOException {
        
        Scanner sc = new Scanner (System.in);
        
        /*char C;
        System.out.println("Introduce una letra");
            C = (char)System.in.read();
            
        if(Character.isUpperCase(C)) {
            System.out.println("El carácter: " + C + ", está en Mmayúsculas");
        }
        else {
            System.out.println("El carácter " + C + ", no está en mayúsculas ");
        }*/
        
        char C;
        System.out.println("Introduce una letra");
        C = (char)System.in.read();
        
        if(C>='A' && C<='Z') {
            System.out.println("El carácter " + C + ", es una letra mayúscula" );
        }
        else {
            System.out.println("El carácter " + C + ", no es una letra mayúscula" );
        }
        
        
    }
}
