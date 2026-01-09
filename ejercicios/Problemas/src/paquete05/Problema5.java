/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] sumaMatriz = obtenerSuma(informacion, informacion2);
        String reporte = "";

        for(int i = 0; i < sumaMatriz.length; i++) {
            for (int j = 0; j < sumaMatriz[i].length; j++) {
                reporte = String.format("%s%d\t", reporte, sumaMatriz[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        System.out.println(reporte);

    }

    public static int[][] obtenerSuma(int[][] a, int[][] b) {

        int suma[][] = new int[3][3];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];

            }

        }
        return suma;

    }

}
