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
public class Ejercicios {

    public void imprimirDel1Al100() {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
        }

    }

    public void arbolDeI(int numeros) {

        for (int i = 1; i <= numeros; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

    public void arbolInvertidoDeI(int numeros) {

        for (int i = numeros; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void pedirMayor0() {

        Scanner sc = new Scanner(System.in);
        int dato = 1;

        while (dato > 0) {
            System.out.println("Introduzca un número: ");
            dato = sc.nextInt();

        }

        System.out.println("Impresión después del while");

    }

    public void menuStandard() {

        int dato;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca la opción del menú: ");
            System.out.println("2. crear usuario");
            System.out.println("3. borrar usuario");
            System.out.println("4.salir");
            dato = sc.nextInt();

        } while (dato != 3);

        System.out.println("Impresión después del while");

    }

    public void del1al100() {

        int i = 1;

        while (i <= 100) {
            System.out.print(i++ + ", ");
        }

    }

    public void doWhiledel1al100() {

        int i = 1;

        do {
            System.out.print(i++ + ", ");
        } while (i <= 100);
    }

    public String convertirANumerosRomanos(int numero) {
        Scanner sc = new Scanner(System.in);

        String resultado = "";
        int unidades, decenas, centenas, millares;
        unidades = numero % 10;
        decenas = (numero - unidades) %100;
        centenas = (numero - decenas - unidades) %1000;
        millares = (numero - centenas - decenas - unidades);
        
        switch (centenas) {
            case 1:
                resultado += "C";
                break;
            case 2:
                resultado += "CC";
                break;
            case 3:
                resultado += "CCC";
                break;
            case 4:
                resultado += "CD";
                break;
            case 5:
                resultado += "D";
                break;
            case 6:
                resultado += "DC";
                break;
            case 7:
                resultado += "DCC";
                break;
            case 8:
                resultado += "DCCC";
                break;
            case 9:
                resultado += "CM";
                break;
        }

        switch (decenas) {
            case 10:
                resultado += "X";
                break;
            case 20:
                resultado += "XX";
                break;
            case 30:
                resultado += "XXX";
                break;
            case 40:
                resultado += "XL";
                break;
            case 50:
                resultado += "L";
                break;
            case 60:
                resultado += "LX";
                break;
            case 70:
                resultado += "LXX";
                break;
            case 80:
                resultado += "LXXX";
                break;
            case 90:
                resultado += "XC";
                break;
}

        switch (unidades) {

            case 1:
                resultado += "I";
                break;
            case 2:
                resultado += "II";
                break;
            case 3:
                resultado += "III";
                break;
            case 4:
                resultado += "IV";
                break;
            case 5:
                resultado += "V";
                break;
            case 6:
                resultado += "VI";
                break;
            case 7:
                resultado += "VII";
                break;
            case 8:
                resultado += "VIII";
                break;
            case 9:
                resultado += "IX";
                break;

        }
        

        return resultado;
    }

}
