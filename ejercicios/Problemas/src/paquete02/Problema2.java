/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] viviendas = new String[10];
        int[][] consumo = new int[10][12];
        int[] sumaAnual = new int[10];
        
        viviendas = obtenerViviendas();
        consumo = obtenerConsumo();
        sumaAnual = obtenerSuma(consumo);
        
        obtenerReporte(viviendas,sumaAnual);
        
    }
    public static String[] obtenerViviendas () {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String[] viviendan = new String[10];
        
        for(int i =0; i < viviendan.length;i++){
            System.out.printf("Ingrese nombre de la vivienda %s: \n", (i+1));
            viviendan[i] = entrada.nextLine();
            
        }
        return viviendan;
    }
    
    public static int[][] obtenerConsumo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] consumon = new int[10][12];
        
        for (int i = 0; i < consumon.length; i++) {
            for (int j = 0; j < consumon[i].length; j++) {
                System.out.printf("Ingrese el consumo del mes %d de la vivienda"
                        + " %d : \n", j + 1, i + 1);

                consumon[i][j] = entrada.nextInt();
            }

        }
        return consumon;

    }
    public static int[] obtenerSuma(int[][] suma) {
        
        int total ;
        int[] regreso = new  int[10];
                
        for (int i = 0; i < suma.length; i++) {
            total = 0;
            for (int j = 0; j < suma[i].length; j++) {
                total = total + suma[i][j];
            }
                regreso[i] = total;
        }
        return regreso;
    }

    public static void obtenerReporte(String[] v, int[] s) {
        String reporte = "";

        for (int i = 0; i < v.length; i++) {
            reporte = String.format("%sLa vivienda %s "
                    + "consumio %d \n", reporte, v[i], s[i]);
        }
        System.out.printf("REPORTE\n %s", reporte);

    }

}
