package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Crea un algoritmo que calcule el costo de un terremo cuadrado o rectangular,
 * teniendo como datos la anchura y la longitud en metros, ademas el costo del metro cuadrado
 */
public class CostoTerreno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el ancho del terreno: ");
        float anchoTerreno = input.nextFloat();
        System.out.print("Ingrese el largo del terreno: ");
        float largoTerreno = input.nextFloat();
        System.out.print("Ingrese el costo del terreno por metro cuadrado: ");
        double costTerreno = input.nextDouble();

        System.out.printf("Ancho: %.2f\nLargo: %.2f\nCosto neto: %.2f\nTotal : %.2f\n",
                anchoTerreno, largoTerreno, costTerreno,
                CostoTerreno(CalcAreaTerreno(anchoTerreno,largoTerreno),
                        costTerreno));
    }
    private static float CalcAreaTerreno(float ancho, float largo){
        return (ancho * largo);
    }
    private static double CostoTerreno(float areaTerreno, double costMetroCua){
        return costMetroCua * areaTerreno;
    }
}
