/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int respuestau;
        System.out.printf("Ingrese el area de desea obtener"
                + " ( 1 = Cuadrado ,"
                + " 2 = Triangulo ,"
                + " 3 = Rectangulo )\n");
        respuestau = entrada.nextInt();

        switch (respuestau) {
            case 1:
            case 3:
                obtenerAreaCuadrado(respuestau);

                break;
            case 2:
                obtenerAreaTriangulo();

                break;

            default:
                System.out.printf("Error opcion no valida\n");
        }
    }

    public static void obtenerAreaCuadrado(int r) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double lado1;
        double lado2;
        double areaCuadrado;

        System.out.printf("Ingrese el primer lado\n");
        lado1 = entrada.nextDouble();
        System.out.printf("Ingrese el segundo lado\n");
        lado2 = entrada.nextDouble();

        areaCuadrado = lado1 * lado2;

        if (r == 1) {

            System.out.printf("El area del cuadrado Lado1:%.2f y Lado2:%.2f es:"
                    + "\n%.2f\n", lado1, lado2, areaCuadrado);
        } else {
            System.out.printf("El area del rectanfulo Lado1:%.2f y Lado2:%.2f es:"
                    + "\n%.2f\n", lado1, lado2, areaCuadrado);
        }

    }

    public static void obtenerAreaTriangulo() {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double areaTriangulo;

        System.out.printf("Ingrese la base\n");
        base = entrada.nextDouble();
        System.out.printf("Ingrese la altura\n");
        altura = entrada.nextDouble();

        areaTriangulo = (base * altura) / 2;

        System.out.printf("El area del triangulo de base:%.2f y altura:%.2f es:"
                + "\n%.2f\n", base, altura, areaTriangulo);

    }

}
