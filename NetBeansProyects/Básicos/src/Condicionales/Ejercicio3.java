/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

/**
 *
 * @author admin
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        

        System.out.println("Introduce una Tecla: ");
        char letra = sc.next().charAt(0);
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("Es mayúscula");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es minúscula");
        } else {
            System.out.println("Carácter no identificado");
        }
    }
