package com.secuenciacion.Ejercicios;

import java.util.Scanner;

public class CalcEsfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Radio de la esfera: ");
        double radius = input.nextDouble();

        System.out.printf("Area: %.4f UCuadradas\n", calculateArea(radius));
        System.out.printf("Volumen: %.4f UCuadradas\n", calculateVolum(radius));
    }

    public static double calculateArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    private static double calculateVolum(double radius) {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
