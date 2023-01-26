package com.secuenciacion.Ejercicios;

import java.util.Scanner;

public class CalculateZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el valor de w: ");
        double w = in.nextDouble();
        System.out.printf("z = %f", calculateVariableZeta(w));
    }
    private static double calculateVariableZeta(double varW){
        double part1 = 1/ (Math.sqrt(2 * Math.PI));
        double part2 = Math.sqrt(Math.pow(Math.E,Math.pow(varW,2)));
        return  part1 * part2;
    }
}
