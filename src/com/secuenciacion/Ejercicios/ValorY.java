package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 *Ejercicio 6
 * Hacer un algoritmo que obtenga e imprima el valor de Y a partir de la ecuacion
 * Y = 3x2 + 7x - 15
 */
public class ValorY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de x:");
        double x = input.nextDouble();
        System.out.printf("El valor de Y: %.1f \n", valorLiteralY(x));
    }
    private static double valorLiteralY(double valorx){
        return (double)((3 * Math.pow(valorx,2))
        + (7 * valorx)
        - 15);
    }
}
