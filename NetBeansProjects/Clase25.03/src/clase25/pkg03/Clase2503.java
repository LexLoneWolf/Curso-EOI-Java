/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25.pkg03;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Clase2503 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ejercicios e = new Ejercicios();
//        
//        e.imprimirDel1Al100();
//        e.arbolDeI(40);
//        e.arbolInvertidoDeI(20);
//        e.menuStandard();
//        e.del1al100();
//        e.doWhiledel1al100();
//        e.convertirANumerosRomanos(44);

        int numero = 1;
        String cadenaRomana;
        while (numero != 0) {
            System.out.println("Introduce un número");
            numero = sc.nextInt();
            cadenaRomana = e.convertirANumerosRomanos(numero);
            
        if (cadenaRomana.length()>0) {
            System.out.println(cadenaRomana);
                    
        }
        }

    }

}
