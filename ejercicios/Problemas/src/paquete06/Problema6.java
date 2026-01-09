/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = encontrarAritmetica(informacion);
        double desviacion = encontrarDesviacionEstandar(informacion, media);
        System.out.printf("La media aritmetica es: %.0f\n"
                + "La desviacion estandar es: %.2f\n",
                media, desviacion);
    }

    public static double encontrarAritmetica(int[] a) {

        double promedio;
        double suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        promedio = suma / a.length;
        return promedio;
    }

    public static double encontrarDesviacionEstandar(int a[],
            double promedio) {
        double suma = 0;
        double valor;
        double total;

        for (int i = 0; i < a.length; i++) {
            valor = a[i] - promedio;
            suma = suma + Math.pow(valor, 2);
        }
        total = Math.sqrt(suma / a.length);
        return total;
    }
}
