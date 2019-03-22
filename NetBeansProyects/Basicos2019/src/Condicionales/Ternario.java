/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

/**
 *
 * @author Profesor
 */
public class Ternario {

    public static void main(String[] args) {
        int numero = 4;
        boolean espar;
                
        System.out.println((numero%2==0)?"Es par":"Es impar");
               
        espar = (numero%2==0)?true:false;
        System.out.println(espar);

    }

}
