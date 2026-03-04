package edu.chansAnder.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para verificar el comportamiento de la clase Calculadora.
 * Se comprueban tanto el funcionamiento en condiciones normales como el control de errores.
 * * @author Ander Chans
 * @version 1.0
 */
class CalculadoraTest {

    /**
     * Instancia de la calculadora para realizar las pruebas.
     */
    private final Calculadora calc = new Calculadora();

    /**
     * Prueba los métodos de suma, resta, multiplicación y división en condiciones normales.
     * Este test asegura que los cálculos básicos devuelven los valores esperados.
     * Utilizo assertEquals para que me verifique si esta bien el resultado
     */
    //Pongo 10 para ver si funciona el assertEquals pero si ponemos algo diferente ha eso nos saltara un error
    @Test
    void testCompleto() {
        // Verificación de las cuatro operaciones básicas
        assertEquals(10.0, calc.sumar(5, 5), "La suma de 5 + 5 debería ser 10");
        assertEquals(5.0, calc.restar(10, 5), "La resta de 10 - 5 debería ser 5");
        assertEquals(20.0, calc.multiplicar(4, 5), "La multiplicación de 4 * 5 debería ser 20");
        assertEquals(2.0, calc.dividir(10, 5), "La división de 10 / 5 debería ser 2");
    }

    /**
     * Verifica que la calculadora lance una excepción cuando se intenta dividir por cero.
     * Cumple con el requisito obligatorio de control de errores mediante IllegalArgumentException.
     * * @see IllegalArgumentException
     */
    @Test
    void testExcepcion() {
        // Verificación del caso de error obligatorio
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        }, "Debería lanzar IllegalArgumentException al dividir por cero");
    }
}
