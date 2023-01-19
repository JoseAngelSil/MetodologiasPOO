package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 5
 * La velocidad de la luz es de 300 000 kilometros por segundo.
 * Elaborar un programa que lea un tiempo en segundos e imprima la distancia
 * que recorre la luz en dicho tiempo.
 */
public class VelocidadLuz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en segundos: ");
        int cantSegund = input.nextInt();
        int distanciaRecorrida = cantSegund * 300000;
        System.out.printf("Distancia recorrida en %d segundos es \n>%d km/s\n",
                cantSegund,
                distanciaRecorrida);
    }
}
