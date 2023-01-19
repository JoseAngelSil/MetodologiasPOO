package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 4
 * A base de la clase {@link com.secuenciacion.Actividades.PromedioAlumno}
 * con la diferuencia que el promedio  se obtiene una calificacion final multiplicando
 * las calificaciones 1 al 4 por los porcentajes 30,20,10,40% respectetivamente y sumando los
 * productos
 */
public class CalcAlumn {
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

        float prom = ((cal1 * 0.3f)
                + (cal2 * 0.2f)
                + (cal3 * 0.1f)
                + (cal4 * 0.4f)
        );
        System.out.printf("Promedio de %s es %.2f: ",strnombreDelAlumno,prom);
    }
}
