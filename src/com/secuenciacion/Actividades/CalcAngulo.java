package com.secuenciacion.Actividades;

import java.util.Scanner;

/**
 * Clase de calculo de angulo que ingresa en radianes
 */
public class CalcAngulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declaracion y solicitud de la variable
        System.out.print("Ingrese el angulo en radianes: ");
        double angle = input.nextDouble();
        double angleSen = Math.sin(angle);
        double angleCos = Math.cos(angle);
        System.out.println("Sin:" + angleSen);
        System.out.println("Cos:" + angleCos);
    }
}
