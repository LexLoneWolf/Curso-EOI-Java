/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.pkg04;

/**
 *
 * @author admin
 */
public class Coche {

    //Atributos
    private int anyo;
    private String matricula;
    private String marca;
    private String modelo;
    private int km;
    private static int numeroCoches = 0;

    //Constructores
    public Coche() { //Constructor vacío
        this.numeroCoches++;
    }
    // Constructores con parámetros
    public Coche(int anyo, String matricula, String marca, String modelo, int km) {
        this.anyo = anyo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.numeroCoches++;
    }

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Constructor de copia
    
    public Coche(Coche coche) {
        
        this.matricula = coche.getMatricula();
        this.marca = coche.getMarca();
        this.modelo = coche.getModelo();
        this.anyo = coche.getAnyo();
        this.km = coche.getKm();
        this.numeroCoches++;
        
    }

    //Getter and Setter
    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public static int getNumeroCoches() {
        return numeroCoches;
    }

    public static void setNumeroCoches(int numeroCoches) {
        Coche.numeroCoches = numeroCoches;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("--------------------");
        sb.append("\nMatricula: " + this.matricula);
        sb.append("\n" + this.marca + " " + this.modelo);
        sb.append("\nKilómetros: " + this.km);
        sb.append("\n--------------------");
        return sb.toString();

    }

}
