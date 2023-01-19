package com.secuenciacion.Actividades;

import java.util.Scanner;

public class CalAngulos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un angulo en radian: ");
        double gradRadian = input.nextDouble();
        System.out.print("Ingrese un angulo en degrado: ");
        double gradDeg = input.nextDouble();

        System.out.printf("Ang Rad: %.4f to Ang Deg: %.4f\n", gradRadian, radToDeg(gradRadian));
        System.out.printf("Ang Deg: %.4f to Ang Rad: %.4f\n", gradDeg, gradToRad(gradDeg));
    }

    /**
     *
     * @param grad Angulo en grados
     * @return  Angulo en radianes
     */
    private static Double gradToRad(double grad){
        return Math.toRadians(grad);
    }

    /**
     *
     * @param rad   Angulo en radianes
     * @return  Angulo en grados
     */
    private static Double radToDeg(double rad){
        return Math.toDegrees(rad);
    }
}
