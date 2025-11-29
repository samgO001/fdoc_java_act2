package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Programa con varios ejercicios sobre ciclos.
        // Todos los ejercicios están implementados dentro de este método `main`.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Datos de ejemplo reutilizables
        int[] sampleArray = {3, 7, 1, 9, 4, 6, 2};
        String[] words = {"uno", "dos", "tres", "cuatro"};

        // Ejercicios: WHILE
        System.out.println("\n--- WHILE: imprimir números del 1 al 10 (validando límites antes de cada iteración) ---");
        int i = 1;
        while (true) {
            // Validación del límite antes de realizar la iteración
            if (i > 10) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("\n--- WHILE: sumar de 1 a n (ingrese n >= 1) ---");
        System.out.print("Ingrese n: ");
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            sc.next(); // consumir token inválido
        }
        if (n < 1) {
            System.out.println("Valor inválido para n. Se requiere n >= 1. Resultado: 0");
        } else {
            int sum = 0;
            int k = 1;
            while (k <= n) {
                sum += k;
                k++;
            }
            System.out.println("Suma de 1 a " + n + " = " + sum);
        }

        System.out.println("\n--- WHILE: buscar número en arreglo (se detiene al encontrarlo) ---");
        System.out.print("Ingrese el número a buscar en el arreglo {3,7,1,9,4,6,2}: ");
        int target = 0;
        if (sc.hasNextInt()) {
            target = sc.nextInt();
        } else {
            sc.next();
        }
        int idx = 0;
        boolean found = false;
        while (idx < sampleArray.length) {
            if (sampleArray[idx] == target) {
                found = true;
                System.out.println("Número " + target + " encontrado en índice " + idx + ".");
                break; // detener al encontrarlo
            }
            idx++;
        }
        if (!found) {
            System.out.println("Número " + target + " no encontrado en el arreglo.");
        }
    }
}