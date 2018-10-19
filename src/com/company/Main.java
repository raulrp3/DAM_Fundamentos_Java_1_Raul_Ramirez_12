package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
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
        numero = (int) validador(0);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 9999! ");
            numero = (int) validador(0);
        }
        sc.close();
        System.out.println(esCapicua(numero));
    }
}
