package com.montecristo.operaciones;

import org.junit.jupiter.api.Test;

import com.montecristo.operaciones.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionesTest {

    @Test
    void deberiaRealizarUnaSuma() {

        Suma suma = new Suma();

        suma.setA(10);
        suma.setB(5);

        suma.calcularResultado();

        assertEquals(15, suma.getResultado());
    }

    @Test
    void deberiaRealizarUnaResta() {

        Resta resta = new Resta();

        resta.setA(10);
        resta.setB(5);

        resta.calcularResultado();

        assertEquals(5, resta.getResultado());
    }

    @Test
    void deberiaRealizarUnaMultiplicacion() {

        Multiplicacion multiplicacion = new Multiplicacion();

        multiplicacion.setA(10);
        multiplicacion.setB(5);

        multiplicacion.calcularResultado();

        assertEquals(50, multiplicacion.getResultado());
    }

    @Test
    void deberiaRealizarUnaDivision() {

        Division division = new Division();

        division.setA(10);
        division.setB(5);

        division.calcularResultado();

        assertEquals(2, division.getResultado());
    }
}