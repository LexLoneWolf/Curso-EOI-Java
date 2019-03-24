/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Meses {

    public static void main(String[] args) {

        Scanner sc;

        sc = new Scanner(System.in); // Reserva memoria para coger datos

        System.out.println("Introduzca el mes en mýmero");
        int mes;
        mes = sc.next();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            default:
                System.out.println("No has metido un número correcto");
                break;
        }
    }
}
