package com.adamortiz.analisis_fechas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnalizadorFechaTest {

    AnalizadorFecha analizador = new AnalizadorFecha();

    @Test
    void fechaCorrectaDentroRango() {
        assertTrue(analizador.fechaValida(2002, 5, 10));
    }

    @Test
    void fechaFueraDeRango() {
        assertFalse(analizador.fechaValida(1999, 5, 10));
    }

    @Test
    void comprobarBisiesto() {
        assertTrue(analizador.esBisiesto(2004));
    }

    @Test
    void signoZodiacoOccidental() {
        assertEquals("Aries", analizador.signoZodiacoOccidental(3, 25));
    }

    @Test
    void signoZodiacoChino() {
        assertEquals("Dragón", analizador.signoZodiacoChino(2000));
    }
}