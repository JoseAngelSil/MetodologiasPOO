package com.secuenciacion.Actividades;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        double base = input.nextDouble();
        System.out.print("Altura del triangulo: ");
        double altura = input.nextDouble();
        System.out.printf("Area del triangulo: %.3f",areaTriangulo(base, altura));
    }
    public static double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }
}
