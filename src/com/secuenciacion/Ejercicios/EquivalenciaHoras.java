package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 3
 * Elaborar un programa que lea una cantidad de horas e imprima su equivalente
 * en minutos, segundos y dias
 */
public class EquivalenciaHoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en horas: ");
        float cantHora = input.nextFloat();
        System.out.printf("Equivalencia de hora en..\nMinutos: %d\nSegundos: %d\nDias: %.4f\n",
                horaToMinute(cantHora),
                horaToSecond(cantHora),
                horaToDay(cantHora));
    }

    public static Short horaToMinute(float inputHora) {
        return (short) (inputHora * 60);
    }
    public static Short horaToSecond(float inputHora) {
        return (short) (horaToMinute(inputHora) * 60);
    }
    public static Float horaToDay(float inputHora) {
        return (float)(inputHora / 24);
    }
}
