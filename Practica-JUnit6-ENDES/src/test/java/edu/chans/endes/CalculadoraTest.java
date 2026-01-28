package edu.chans.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para verificar el correcto funcionamiento de la Calculadora.
 * Se comprueban tanto operaciones aritméticas normales como casos de error.
 */
public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    /**
     * Verifica que el método sumar realice la operación correctamente.
     */
    @Test
    public void testSumar() {
        assertEquals(10.0, calc.sumar(7, 3), "La suma debería ser 10");
    }

    /**
     * Verifica que el método dividir funcione correctamente con valores normales.
     */
    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(10, 5), "10 dividido entre 5 debería ser 2");
    }

    /**
     * Caso de prueba obligatorio: Verifica que al dividir por cero se lance
     * la excepción IllegalArgumentException.
     */
    @Test
    public void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        }, "Debería lanzar IllegalArgumentException al dividir por cero");
    }
}
