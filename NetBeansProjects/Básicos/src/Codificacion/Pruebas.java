/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codificacion;

/**
 *
 * @author admin
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Encriptacion e = new Encriptacion();
        //e.encriptacionCesar("z", 12);
        String cadenaEncriptada = e.encriptacionCesar("hola", 12);
        System.out.println(cadenaEncriptada);
    }

    
   /*    Encriptacion e = new Encriptacion();
       String cadenaEncriptada = e.desencriptacionCesar(cadenaDesencriptada, 12);
       */
       
       
}
