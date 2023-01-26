package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 9
 * Elaborar un algoritmo que lea el articulo y su costo.
 * La utilidad es el 150% y el impuesto es el 15%
 * Calcular e imprimir articulo utilidad, impuesto precio de venta
 */
public class CostoProducto {
    private static final float UTILIDAD = 1.5f;
    private static final float IVA = 0.15f;

    public static void main(String[] args) {
        solDatos();

    }
    private static void solDatos(){
        Scanner input = new Scanner(System.in);
        System.out.print("Articulo: ");
        String product = input.nextLine();
        System.out.print("Costo: ");
        double costo = input.nextDouble();

        double utilidad = calcUtilidad(costo);
        double impuesto = calcImpuesto(costo, utilidad);
        double precioVenta = calcPrecioVenta(costo,utilidad, impuesto);

        System.out.printf("Producto: %s\n" +
                "Costo: %.2f\n" +
                "Utilidad: %.2f\n" +
                "Impuesto: %.2f\n" +
                "Precio Venta: %.2f\n", product,costo,utilidad,impuesto,precioVenta);
    }
    private static double calcUtilidad(double costo){
        return costo * UTILIDAD;
    }
    private static double calcImpuesto(double costo, double utilidad){
        return (costo + utilidad) *IVA;
    }
    private static double calcPrecioVenta(double costo, double utilidad, double impuesto){
        return costo + utilidad + impuesto;
    }
}
