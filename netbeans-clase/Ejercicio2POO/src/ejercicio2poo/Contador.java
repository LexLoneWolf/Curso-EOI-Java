/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

/**
 *
 * @author admin
 */
public class Contador {

    //Atributos
    int cont;
    
    //Construcotres
    
    public Contador() {
    }

    public Contador(int cont) {
        
        if (cont <=0) {
            this.cont = 0;
        }
        else {
            this.cont = cont;
        }
        
    }
    
    public Contador (Contador contador){
        
        this.cont = contador.getCont();
    }
            
    
    
    // Getter And Setter 

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void incrementar() {
        this.cont ++;
    }
    
    
    
    public void decrementar() {
        
        this.cont--;
        
        if (cont <0) {
            
            this.cont = 0;
    }
     
    }
}
