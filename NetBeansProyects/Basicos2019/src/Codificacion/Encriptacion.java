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
public class Encriptacion {
    
    public String encriptacionCesar(String cadena, int N){
        
        String resultado = "";
        char letraactual;
        int letracodificadaactual;
        
        if(N>26){
            N=N%26;
        }
        
        for(int i = 0;i<cadena.length();i++){
            letraactual = cadena.charAt(i);
            letracodificadaactual = (int)letraactual + N;
            if(letracodificadaactual>122){
                letracodificadaactual = letracodificadaactual -26;
            }
            //System.out.println(letracodificadaactual);
            resultado = resultado + (char)letracodificadaactual;
            //System.out.println(resultado);
        }
        
        return resultado;
    }
 
    
    public String desencriptarCesar(String cadena, int N){
        
        String resultado = "";
        char letraactual;
        int letracodificadaactual;
        
        if(N>26){
            N=N%26;
        }
        
        for(int i = 0;i<cadena.length();i++){
            letraactual = cadena.charAt(i);
            letracodificadaactual = (int)letraactual - N;
            if(letracodificadaactual<97){
                letracodificadaactual = letracodificadaactual +26;
            }
            //System.out.println(letracodificadaactual);
            resultado = resultado + (char)letracodificadaactual;
            //System.out.println(resultado);
        }
        
        return resultado;
        
    }
    
}
