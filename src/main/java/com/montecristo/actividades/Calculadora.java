package com.montecristo.actividades;

import com.montecristo.operaciones.Division;
import com.montecristo.operaciones.Multiplicacion;
import com.montecristo.operaciones.OperacionAbstract;
import com.montecristo.operaciones.Resta;
import com.montecristo.operaciones.Suma;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculadora {

    public static void main(String[] args) {

        SpringApplication.run(Calculadora.class, args);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        System.out.println();
        System.out.println("Seleccione una operacion:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");

        int opcion = scanner.nextInt();

        OperacionAbstract operacion;

        switch (opcion) {

            case 1:
                operacion = new Suma();
                break;

            case 2:
                operacion = new Resta();
                break;

            case 3:
                operacion = new Multiplicacion();
                break;

            case 4:
                operacion = new Division();
                break;

            default:
                System.out.println("Operacion no valida.");
                return;
        }

        operacion.setA(a);
        operacion.setB(b);

        operacion.calcularResultado();

        System.out.println();
        System.out.println("Resultado: " + operacion.getResultado());

        scanner.close();
    }
}