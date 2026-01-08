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
        consumo = obtenerCosumo();
        sumaAnual = obtenerSuma();
        
        obtenerReporte();
        
    }
    public static String[] obtenerViviendas (String[] viviendan) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        for(int i =0; i < viviendan.length;i++){
            System.out.println("Ingrese nombre de la vivienda");
            viviendan[i] = entrada.nextLine();
            
        }
        return viviendan;
    }
    
    public static int[][] obtenerConsumo (int[][] consumon){
        
    }
    
}
