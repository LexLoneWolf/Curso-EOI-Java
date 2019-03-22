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
public class Encriptacion {
    
    public String encriptacionCesar(String cadena, int N) {
        
        String resultado = "";
        int letraCodificadaActual;
        char letraActual;
        
        if (N>26) {
            N=N%26;
        }
        
        for (int i = 0; i<cadena.length();i++) {
            
            
            letraActual = cadena.charAt(i);
            letraCodificadaActual = (int)letraActual + N;
            
            if (letraCodificadaActual>122){
                letraCodificadaActual = letraCodificadaActual -26;
            }
            //System.out.println(letraCodificadaActual);
            resultado = resultado + (char)letraCodificadaActual;
            System.out.println(resultado);
        }
            return resultado;   
    }
    
    public String desencriptarCesar(String cadena, int N) {
        
        String resultado = "";
        int letraCodificadaActual;
        char letraActual;
        
        if (N>26) {
            N=N%26;
        }
        
        for (int i = 0; i<cadena.length();i++) {
            
            
            letraActual = cadena.charAt(i);
            letraCodificadaActual = (int)letraActual - N;
            
            if (letraCodificadaActual>97){
                letraCodificadaActual = letraCodificadaActual +26;
            }
            //System.out.println(letraCodificadaActual);
            resultado = resultado + (char)letraCodificadaActual;
            System.out.println(resultado);
        }
            return resultado; 
    }
}

    
