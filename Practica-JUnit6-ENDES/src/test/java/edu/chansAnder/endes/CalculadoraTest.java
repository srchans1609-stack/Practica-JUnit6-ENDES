package edu.chansAnder.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    void testCompleto() {
        // 1. Esto sube el % de MÉTODOS: Tienes que llamar a los 4 métodos
        assertEquals(10.0, calc.sumar(5, 5));      // Prueba sumar
        assertEquals(5.0, calc.restar(10, 5));     // Prueba restar
        assertEquals(20.0, calc.multiplicar(4, 5)); // Prueba multiplicar
        assertEquals(2.0, calc.dividir(10, 5));    // Prueba dividir (caso normal)
    }

    @Test
    void testExcepcion() {
        // 2. Esto sube el % de LÍNEAS: Tienes que forzar el error de la línea 49-51
        // Es obligatorio según las instrucciones
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });
    }
}
