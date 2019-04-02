/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

/**
 *
 * @author admin
 */
public class Cuenta {
    
    
    //Atributos
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    
    
    //constructores

    public Cuenta() {
    }

    public Cuenta(Cuenta cuenta) {
        
        this.nombre = cuenta.getNombre();
        this.numeroCuenta = cuenta.getNumeroCuenta();
        this.tipoInteres = cuenta.getTipoInteres();
        this.saldo = cuenta.getSaldo();
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    
    
    
    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    public boolean ingreso(double cantidad){
        
        if(cantidad < 0 ) {
            
            return false;
        }
            saldo += cantidad;
            return true;
    }
    
    public boolean reintegro(double cantidad){
        
        if(cantidad > 0) {
            
            
            if(saldo >= cantidad) {
                
                saldo-= cantidad;
                return true;
            }
            else{
                
                return false;
            }
            }   else {
            
                return false;
                }
            
        
    }
    
    public void transferencia(Cuenta cuentaDestino, double importe) {
        
       this.reintegro(importe);
       cuentaDestino.ingreso(importe);
    }

    @Override
    public String toString() {
        
        
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------");
        sb.append("\nNombre del cliente: " + this.nombre);
        sb.append("\nNumero de cuenta: " + this.numeroCuenta);
        sb.append("\nTipo de interés: " + this.tipoInteres);
        sb.append("\nSaldo: ").append(this.getSaldo());
        sb.append("\n--------------------");
        return sb.toString();

    }
    
    
    
}
