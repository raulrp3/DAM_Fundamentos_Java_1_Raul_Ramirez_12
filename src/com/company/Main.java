package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static boolean validarNumero(int numero) {
        boolean validado = true;
        if (numero > 9999 || numero < 0) {
            validado = false;
        }
        return validado;
    }

    public static String esCapicua(int numero) {
        String cadenaResultado = "El número SÍ es capicúa.", numeroString = String.valueOf(numero);
        for (int i = 0; i < (numeroString.length() - 1) / 2; i++) {
            if (numeroString.charAt(i) != numeroString.charAt(numeroString.length() - 1 - i)) {
                cadenaResultado = "El número NO es capicúa.";
                break;
            }
        }
        return cadenaResultado;
    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a comrpobar si un número es capicúa!");
        System.out.print("Introduce un número: ");
        numero = validarEntero(sc);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 9999! ");
            numero = validarEntero(sc);
        }
        sc.close();
        System.out.println(esCapicua(numero));
    }
}
