/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Problema7 {

    public static void main(String[] args) {
        String ciudades[] = arreglo();
        presentar(ciudades);
    }

    public static String[] arreglo() {
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        System.out.println("Tamaño del arreglo:");
        int indice = entrada.nextInt();
        entrada.nextLine();
        String ciudades[] = new String[indice];
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("Nombre de la ciudad en la posicion %s :\n", i);
            ciudad = entrada.nextLine();
            ciudades[i] = ciudad;
        }
        return ciudades;
    }

    public static void presentar(String a[]) {
        String mensaje = "";
        String cadena;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            cadena = a[i];
            if (cadena.length() == 4 || cadena.length() == 5) {
                c = c + 1;
                mensaje = String.format("%s\t%s", mensaje, cadena);
            } else if (c == 0) {
                mensaje = "No hay valores que cumplan con el numero de caracteres";
            }
        }
        System.out.printf("\n%s\n", mensaje);
    }

}
