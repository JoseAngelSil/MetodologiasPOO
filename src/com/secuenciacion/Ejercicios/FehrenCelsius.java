package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 6
 * @author Jose Angel
 * Elaborar un algoritmo que lea una tempreatura en grados Celsius y obtenga e
 * imprima la tempretatura Fahrengeit equivalente
 */
public class FehrenCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius");
        double temp = input.nextDouble();
        System.out.printf("Fahrengeit: %.2f\n", tempFahren(temp));
    }
    public static double tempFahren(double temp) {
        return ((1.8 * temp) + 32);
    }
}
