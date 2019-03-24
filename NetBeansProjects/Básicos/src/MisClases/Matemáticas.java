/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author admin
 */
public class Matemáticas {

    double PI = 3.14;
    
    public double sumarDosNumeros(double numero1, double numero2) {
        
//        double resultado;
//        
//        resultado = numero1 + numero2;
//        return resultado;

    return numero1 + numero2;

    }
               
    public double areaCuadrado(double lado) {
        
        return  lado*lado;
    }
    
    public double calcularVolumenEsfera(double radio) {
        
        return (4.0/0) * PI * radio * elevarAlCubo(radio);
    }
    
    private double elevarAlCubo (double numero) {
        
        return numero * numero * numero;
    }
    
}
 
    