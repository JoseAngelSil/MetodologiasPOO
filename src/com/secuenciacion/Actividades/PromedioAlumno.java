package com.secuenciacion.Actividades;

import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre del alumno: ");
        String strnombreDelAlumno = input.nextLine();
        System.out.print("Cal 1: ");
        float cal1 = input.nextFloat();
        System.out.print("Cal 2: ");
        float cal2 = input.nextFloat();
        System.out.print("Cal 3: ");
        float cal3 = input.nextFloat();
        System.out.print("Cal 4: ");
        float cal4 = input.nextFloat();

        float prom = (cal1 + cal2 + cal3 + cal4) / 4;
        System.out.printf("Promedio de %s es %.2f: ",strnombreDelAlumno,prom);
    }
}
