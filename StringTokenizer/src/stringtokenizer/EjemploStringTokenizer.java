/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class EjemploStringTokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String colores = "Blanco, Rojo, Verde y Azul";
        StringTokenizer st = new StringTokenizer(colores);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        String colores2 = "Blanco, Rojo, Verde y Azul";
        StringTokenizer st2 = new StringTokenizer(colores2, ",");
        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        
    }
    
}
}