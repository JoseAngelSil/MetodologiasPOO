package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Elaborar un programa que lea el radio de un circulo e imprima el area
 */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Radio: ");
        double radius = input.nextDouble();

        System.out.printf("Area: %.4f UCuadradas\n", calculateArea(radius));
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
