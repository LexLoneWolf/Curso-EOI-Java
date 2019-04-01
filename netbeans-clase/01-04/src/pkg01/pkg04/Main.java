/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.pkg04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    
    static ArrayList<Coche> coches = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO code application logic here
        int respuesta = 0;

        /*Coche coche1 = new Coche();

        Coche coche2 = new Coche("6016DBR", "BMW", "Z3");

        Coche coche3 = new Coche(0, "1234", "BMW", "Z3", -1);

        System.out.println(coche2.toString());
        System.out.println(coche3.toString());*/
        
        
        do {
            System.out.println("1. Introducir coche");
            System.out.println("2. Modificar coche");
            System.out.println("3. Imprimir coche");
            System.out.println("4. Borrar coche");
            System.out.println("5. Numero de coches");
            System.out.println("6. Búsqueda por marcas");
            System.out.println("7. Búsqueda por kilometraje");
            System.out.println("8. Crear coche a partir de otro");
            
            
            System.out.println("0. Salir");
            respuesta = sc.nextInt();
            
            switch (respuesta) {
                case 1:
                    insertarCoche();
                    break;
                case 2:
                    modificarCoche();
                    break;
                case 3:
                    imprimirCoche();
                    break;
                case 4:
                    borrarCoche();
                    break;
                case 5:
                    System.out.println("El número de coches es: " + Coche.getNumeroCoches());
                    break;
                case 6:
                    System.out.println("Introduzca una marca");
                    String marca =  sc.next();
                    buscarCochePorMarca(marca);
                    break;
                case 7:
                    System.out.println("Introduzca el número de km máximo para su coche");
                    int km = sc.nextInt();
                    buscarCochesPorMenosKm(km);
                    break;
                case 8:
                    crearCocheAPartirDeOtro(coches.get(0));
                    break;
                    
                    
            }
            
        } while (respuesta != 0);
        
    }
    
    public static void insertarCoche() {
        
        Coche coche = new Coche();
        System.out.println("Introduzca matrícula");
        coche.setMatricula(sc.next());
        System.out.println("Introduzca modelo");
        coche.setModelo(sc.next());
        System.out.println("Introduzca Marca");
        coche.setMarca(sc.next());
        System.out.println("Introduzca Año de fabricación");
        coche.setAnyo(sc.nextInt());
        System.out.println("Introduzca Km");
        coche.setKm(sc.nextInt());
        
        coches.add(coche);
    }
    
    public static void modificarCoche() {
        
        System.out.println("Introduzca matrícula a modificar");
        String matricula = sc.next();
        if (existeCoche(matricula)) {
            for (Coche coche : coches) {
                if (coche.getMatricula().equals(matricula)) {
                    System.out.println("Introduzca marca");
                }
                coche.setMarca(sc.next());
                System.out.println("Introduzca modelo");
                coche.setModelo(sc.next());
                
            }
        } else {
            System.out.println("La matrícula no existe");
        }
    }
    
    public static void imprimirCoche() {
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }
    
    public static void borrarCoche() {
        int borrar = -1;
        System.out.println("Introduzca la matrícula a borrar");
        String matricula = sc.next();
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                // coches.remove(coche); fallo por eliminar el objeto que está tratando el bucle al recorrer el ArrayList
                borrar = coches.indexOf(coche);
                
            }
            
        }
        if (borrar != -1) {
            coches.remove(borrar);
            Coche.setNumeroCoches(Coche.getNumeroCoches() - 1);
            System.out.println("El coche ha sido borrado");
        } else {
            System.out.println("Matrícula no encontrada");
        }
    }
    
    public static boolean existeCoche(String matricula) {
        
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                return true;
            }
            
        }
        return false;
    }
    
    public static void buscarCochePorMarca(String marca){
        
        for (Coche coche : coches){
            if (coche.getMarca().equals(marca)) {
                System.out.println(coche.toString());
            }
    }
    }
    
    public static void buscarCochesPorMenosKm(int km){
        for(Coche coche:coches){
           if (coche.getKm()<km) {
               System.out.println(coche.toString());
           }
        }
           
    }
    
    public static void crearCocheAPartirDeOtro(Coche coche) {
        
        Coche nuevo = new Coche(coche);
        System.out.println("Introduzca nueva matrícula");
        String matricula = sc.next();
        coches.add(nuevo);
        nuevo.setMatricula(matricula);
        
    }
    
    
}
