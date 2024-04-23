package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                // case 1:
                //     convertirLongitud(scanner);
                //     break;
                // case 2:
                //     convertirTemperatura(scanner);
                //     break;
                // case 3:
                //     convertirPeso(scanner);
                //     break;
                // case 4:
                //     convertirDatos(scanner);
                //     break;
                // case 5:
                //     convertirMoneda(scanner);
                //     break;
                case 6:
                    convertirTiempo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n**Calculadora de conversiones**");
        // System.out.println("1. Longitud");
        // System.out.println("2. Temperatura");
        // System.out.println("3. Peso");
        // System.out.println("4. Datos");
        // System.out.println("5. Moneda");
        System.out.println("6. Tiempo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Tiempo
    // -----------------------------------------------------------------------------
    private static void convertirTiempo(Scanner scanner) {

            System.out.println("\n**Conversión de tiempo**");
            System.out.println("1. Segundos a minutos");
            System.out.println("2. Minutos a horas");
            System.out.println("3. Horas a días");
            System.out.println("4. Dìas a horas");
            System.out.println("5. Horas a minutos");
            System.out.println("6. Minutos a segundos");
            System.out.println("0. Regresar al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcionTiempo = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
    
            switch (opcionTiempo) {
                case 1:
                    convertirSegundosAMinutos(scanner);
                    break;
                case 2:
                    convertirMinutosaHoras(scanner);
                    break;
                case 3:
                    convertirHorasADias(scanner);
                    break;
                    case 4:
                    convertirDiasAHoras(scanner);
                    break;
                case 5:
                    convertirHorasAMinutos(scanner);
                    break;
                case 6:
                    convertirMinutosASegundos(scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo."); 
            }
    }

    private static void convertirSegundosAMinutos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de segundos: ");
        double segundos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double minutos = segundos / 60;
        System.out.println(segundos + " segundos equivalen a " + minutos + " minutos.");
    }

     private static void convertirMinutosaHoras(Scanner scanner) {
        System.out.print("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double horas = minutos / 60;
        System.out.println(minutos + " minutos equivalen a " + horas + " horas.");
        }

       private static void convertirHorasADias(Scanner scanner) {
        System.out.print("Ingrese la cantidad de horas: ");
        double horas = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double dias = horas / 24;
        System.out.println(horas + " horas equivalen a " + dias + " dias.");
      }
       private static void convertirDiasAHoras(Scanner scanner) {
        System.out.print("Ingrese la cantidad de dìas: ");
        double dias = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double horas = dias * 24;
        System.out.println(dias + " dìa(s) equivalen a " + horas + " horas.");
      }
       private static void convertirHorasAMinutos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de horas: ");
        double horas = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double minutos = horas * 60;
        System.out.println(horas + " horas equivalen a " + minutos + " minutos.");
      }
       private static void convertirMinutosASegundos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de minutos: ");
        double minutos = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double segundos = minutos * 60;
        System.out.println(minutos + " minutos equivalen a " + segundos + " segundos.");
      }

      
  
}
