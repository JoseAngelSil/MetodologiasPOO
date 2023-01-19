package com.secuenciacion.Actividades;

import java.util.Scanner;

/**
 * Clase sobre sueldo de empleado
 * primer algoritmo a codigo Java
 */
public class SueldoEmpleado {
    public static void main(String[] args) {
        // Llamar la clase de scanner en el objeto de input
        Scanner input = new Scanner(System.in);
        //Declarar variables
        String strNombre;
        int intHorasTrab;
        double cuotaHora, sueldo;

        // solicitud de datos
        System.out.print("Ingrese el nombre del empleado: ");
        strNombre = input.nextLine();
        System.out.print("Ingrese las horas trabajas: ");
        intHorasTrab = input.nextInt();
        System.out.print("Ingrese la couta por hora: ");
        cuotaHora = input.nextDouble();

        // Calculo del sueldo
        sueldo = cuotaHora * intHorasTrab;
        //impresion del resultado
        System.out.printf("Nombre: %s\nSueldo total: %.3f\n", strNombre,sueldo);
    }
}
