/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Pruebas {
    
    public static void main(String[] args) {
        
        Matematicas ma = new Matematicas();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca el lado del cuadrado: ");
        double lado = sc.nextDouble();
        double resultado = ma.areaCuadrado(lado);
        System.out.println(resultado);
        System.out.println("Introduzca el radio de la esfera");
        double radio = sc.nextDouble();
        resultado = ma.calcularVolumenEsfera(radio);
        System.out.println(resultado);
        
    }
    
}
