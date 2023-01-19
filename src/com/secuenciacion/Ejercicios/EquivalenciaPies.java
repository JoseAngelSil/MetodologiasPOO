package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 8
 * Elabore un algoritmo que lea un nuemro de pies y calcule e imprima su evivalencia
 * en yardas, pulgadas, centimetros y metros.
 */
public class EquivalenciaPies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pies: ");
        double dbFt = input.nextDouble();
        System.out.println("Pulgadas: " + ftToInch(dbFt));
        System.out.println("Yardas: " + ftToYrd(dbFt));
        System.out.println("Centimetro: " + ftoCm(dbFt));
        System.out.println("Metros: " + ftToM(dbFt));
    }
    private static double ftToInch(double inFt){
        return inFt * 12;
    }
    private static double ftToYrd(double inFt){
        return  inFt / 3;
    }
    private static double ftoCm(double inYrd){
        return  ftToInch(inYrd) * 2.54;
    }
    private static double ftToM(double inYrd){
        return  ftoCm(inYrd) / 100;
    }
}
