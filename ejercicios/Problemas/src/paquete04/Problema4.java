/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int respuestau;
        String nombre;
        String cedula;

        System.out.printf("Ingrese el tipo de calculo que desea hacer "
                + "( 1 Valor de Luz | 2 Calcular Predio )\n");
        respuestau = entrada.nextInt();
        
        entrada.nextLine();

        switch (respuestau) {
            case 1:
            case 2:
                System.out.printf("Ingrese su nombre: \n");
                nombre = entrada.nextLine();
                System.out.printf("Ingrese su cedula: \n");
                cedula = entrada.nextLine();
                if (respuestau == 1) {
                    obtenerValorLuz(nombre, cedula);
                } else {
                    obtenerCalcularPredio(nombre, cedula);
                }

                break;
            default:
                System.out.printf("Error Opcion no valida\n");

        }       
    }
    
    public static void obtenerValorLuz(String n, String c) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);        
        
        double vKilowatio;
        double nKilowatio;
        double vLuz;
        
        System.out.printf("Ingrese el valor del kilowatio:\n");
        vKilowatio = entrada.nextDouble();
        System.out.printf("Ingrese el numero de kilowatios del mes:\n");
        nKilowatio = entrada.nextDouble();
        
        vLuz = vKilowatio * nKilowatio;
        
        System.out.printf("Cliente %s con cedula %s debe canceclar el valor de %.2f\n",n,c,vLuz);
    }
    public static void obtenerCalcularPredio(String n, String c) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double porcentaje = 0.02;
        double predio;
        double vInmueble;
        
        System.out.printf("Ingrese el valor del Inmueble:\n");
        
        vInmueble = entrada.nextDouble();
        
        predio = vInmueble * porcentaje;
        
        System.out.printf("%s con cedula %s tiene un inmueble valorado en %.2f y"
                + " tiene que pagar %.2f\n",n,c,vInmueble,predio);
        
    }

}
