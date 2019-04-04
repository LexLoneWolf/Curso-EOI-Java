/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerfichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class LeerFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            
            FileReader fr = new FileReader ("C:\\Users\\admin\\Documents\\NetBeansProjects\\Clase0404File\\Ficheros\\Empleados\\empleados.csv");
            
           
            
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            int contadorLineas = 0;
            StringBuilder sb = new StringBuilder();
            int sumaSalarios = 0;
            int salario = 0;
            int salarioMax=0, salarioMin= 800000;
            String nombre;
            String nombreSMax="",nombreSMin="";
            
            
            
            try {
                while ((linea = br.readLine()) != null) {
                    contadorLineas++;
                    //Aquí recorro el fichero línea a línea
                    
                    //System.out.println(linea);
                    
                    if (contadorLineas!=1){
                        sb.setLength(0);
                        sb.append(linea);
                        sumaSalarios += Integer.parseInt(sb.substring(sb.lastIndexOf(";")+1));
                        
                        salario = Integer.parseInt(sb.substring(sb.lastIndexOf(";")+1));
                        nombre = sb.substring(0,sb.indexOf(";"));
                        
                        if(salarioMax < salario) {
                            
                            salarioMax = salario;
                            nombreSMax = nombre;
                        }
                        if (salarioMin > salario) {
                        
                            salarioMin = salario;
                            nombreSMin = nombre;
                               
                        }
                    }
                    
                    
                }
                
                System.out.println("El salario medio es: " + ((double)sumaSalarios/contadorLineas-1));
                System.out.println("");
                System.out.println("El empleado con el salario más alto es el " + nombreSMax + " con un sueldo de " + salarioMax);
                System.out.println("El empleado con el salario más bajo es el " + nombreSMin + " con un sueldo de " + salarioMin);
                
                
            } catch (IOException ex) {
                System.out.println("No he podido leer el fichero");
            }
            
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("No he podido abrir el fichero");
        }
    }
    
}
