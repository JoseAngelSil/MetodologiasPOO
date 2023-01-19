package com.secuenciacion.Actividades;

import java.util.Scanner;

public class PrecioEnVenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Descripcion: ");
        String strDescripcion = input.nextLine();
        System.out.print("Costo del producto: ");
        float costoProduct = input.nextFloat();
        double precioVenta = costoProduct + // cosot de produccion
                            (costoProduct * 1.2) + // costo de utilidad
                            ((costoProduct + (costoProduct * 1.2)) * 1.5); // Cosoto de impuesto
        System.out.printf("Producto: %s.\nPrecio de Venta: %.3f\n",
                strDescripcion,
                precioVenta);
    }
}
