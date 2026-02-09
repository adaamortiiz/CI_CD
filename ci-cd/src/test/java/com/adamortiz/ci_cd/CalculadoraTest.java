package com.adamortiz.ci_cd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, calculadora.restar(5, 4));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(10, calculadora.multiplicar(2, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculadora.dividir(10, 5));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}