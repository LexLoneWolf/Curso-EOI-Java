/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;


/**
 *
 * @author lareo
 */
public class Ejercicio5 {
    public static void main(String[] args)throws java.io.IOException {
        
        
        
        char car1, car2;
        
        System.out.println("Introduzca primer car�cter: ");
            car1 = (char)System.in.read();
        System.in.read();
        System.out.println("Introduzca segundo car�cter: ");
            car2 = (char)System.in.read();    
        if(car1>='a' && car1<='z'){
            if(car2>='a' && car2<='z')
                System.out.println("Los dos son letras min�sculas");
            else
                System.out.println("El primero es una letra min�scula pero el segundo no");
        }
        else{
            if(car2>='a' && car2<='z')
                System.out.println("El segundo es una letra min�scula pero el primero no");
           else
                System.out.println("Ninguno es una letra min�scula");
        }
        
        
		
	
        
//        char C1,C2;
//        
//        System.out.println("Introduce el primer carácter");
//            C1 = (char)System.in.read();
//            System.in.read();
//        System.out.println("Introduzca el segundo carácter");
//            C2 = (char)System.in.read();
//        
//        if(C1>='A' && C1<='Z') {
//           
//        }
//        if(C2>='A' && C2<='Z') {
//           System.out.println("Los dos son minúsculas");
//        }
//        
//        else {
//            System.out.println("el primero está en minúsculas el segundo no.");
//        }
//        else {
//            if(C2>='A' && C2<='Z'){
//                System.out.println("");
//                }
//                
//        }
//        
        
        
//        if (C2>='A' && C2<='Z'== C1>='A' && C1<='Z') {
//            System.out.println("Los carácteres " + (C1 + C2) + ", son letras minúsculas");
//        }
//        else {
//            System.out.println("El carácter introducido no es válido");
//        }
    
        
        
        
//        if(C2>='A' && C2<='Z'){
//            System.out.println("Los carácteres " + (C1 + C2) + ", son letras minúsculas");
//        }
//        else if (C2>='A' && C2<='Z'!= C1>='A' && C1<='Z') {
//            System.out.println("Los carácteres " + (C1 + C2) + ", no son letras minúsculas");
//            
//        }
//        else {
//            System.out.println("el carácter introducido no es válido");
//        }
//        
    
    }
}
