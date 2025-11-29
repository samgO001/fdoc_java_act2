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
        
        // Ejercicios: DO-WHILE
        System.out.println("\n--- DO-WHILE: menú interactivo (se muestra al menos una vez) ---");
        int opcion;
        do {
            System.out.println("Menú:\n1) Saludar\n2) Mostrar arreglo de palabras\n0) Salir");
            System.out.print("Elija una opción: ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                sc.next();
                opcion = -1;
            }
            if (opcion == 1) {
                System.out.println("¡Hola! Esta es la opción Saludar.");
            } else if (opcion == 2) {
                System.out.println("Contenido del arreglo de palabras:");
                for (String w : words) {
                    System.out.println("- " + w);
                }
            } else if (opcion == 0) {
                System.out.println("Saliendo del menú.");
            } else {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        System.out.println("\n--- DO-WHILE: leer números hasta ingresar 0 y mostrar suma acumulada ---");
        int valor;
        int acumulado = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
            } else {
                sc.next();
                valor = 0;
            }
            if (valor != 0) {
                acumulado += valor;
            }
        } while (valor != 0);
        System.out.println("Suma acumulada = " + acumulado);

        // Consumir posible salto de línea antes de leer contraseñas con nextLine
        sc.nextLine();
        System.out.println("\n--- DO-WHILE: validación de contraseña (repite hasta acertar) ---");
        String contraseñaCorrecta = "abc123";
        String intento;
        do {
            System.out.print("Ingrese la contraseña: ");
            intento = sc.nextLine();
            if (!intento.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
        } while (!intento.equals(contraseñaCorrecta));
        System.out.println("Contraseña correcta. Acceso concedido.");

        // Mantener scanner abierto para ejercicios posteriores (se cerrará al final)
        
        // Ejercicios: FOR
        System.out.println("\n--- FOR: imprimir números pares del 2 al 20 ---");
        for (int p = 2; p <= 20; p += 2) {
            System.out.println(p);
        }

        System.out.println("\n--- FOR: calcular factorial de un número ingresado ---");
        System.out.print("Ingrese un entero no negativo para factorial: ");
        int m = 0;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
        } else {
            sc.next();
        }
        if (m < 0) {
            System.out.println("Valor inválido (negativo). No se puede calcular factorial.");
        } else {
            long fact = 1L;
            for (int t = 2; t <= m; t++) {
                fact *= t;
            }
            System.out.println(m + "! = " + fact);
        }

        System.out.println("\n--- FOR: sumar elementos de un arreglo usando contador ---");
        int sumaArray = 0;
        for (int j = 0; j < sampleArray.length; j++) {
            sumaArray += sampleArray[j];
        }
        System.out.println("Suma de elementos del arreglo = " + sumaArray);
    }
}