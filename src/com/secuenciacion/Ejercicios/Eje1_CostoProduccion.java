package com.secuenciacion.Ejercicios;

import java.util.Scanner;

/**
 * Ejercicio 1
 * Crear un algoritmo que coalcule e imprima el costo de produccion de un articulo,
 * teniendo como datos la descricion y el nuemro de unidades producidas.
 * El costo se calcula multiplicando el numero de unidades producidas por un factor
 * de costo de materiales de 3.5 y sumandose al producto un costo fijo de 10 700
 */
public class Eje1_CostoProduccion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la descripcion del producto: ");
        String strDescripProduct = input.nextLine();
        System.out.print("Ingrese la cantidad de productos:");
        int intCantidadProduct =  input.nextInt();

        System.out.printf("Descripcion: %s\nCosto del producto: %.2f\n",
                strDescripProduct,
                CostoPruducto(intCantidadProduct)
        );

    }
    private static double CostoPruducto(int uniProd){
        return (double) (uniProd * 3.5) + 10700;
    }
}
