package com.secuenciacion.Ejercicios;

import java.util.Scanner;

public class CompraDolar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Cantidad de Dolares: ");
        double dolar = inp.nextDouble();

        System.out.printf("Cantidad por pagar en moneda mxm: %.3f \n",
                payPesosForDolars(dolar));

    }
    private static double payPesosForDolars(double dolar) {
        return dolar * 18.8;
    }
}
