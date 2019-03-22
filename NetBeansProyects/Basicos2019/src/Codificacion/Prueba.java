/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codificacion;

/**
 *
 * @author Profesor
 */
public class Prueba {
    public static void main(String[] args) {
        Encriptacion e = new Encriptacion();
        String cadenaencriptada = e.encriptacionCesar("badajoz", 12);
        System.out.println(cadenaencriptada);
        String cadenadesencriptada = e.desencriptarCesar(cadenaencriptada, 13);
        System.out.println(cadenadesencriptada);
    }
    
}
