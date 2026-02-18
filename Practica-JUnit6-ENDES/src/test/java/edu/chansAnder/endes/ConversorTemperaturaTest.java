package edu.chansAnder.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ConversorTemperatura.
 * Verifica que las conversiones entre grados Celsius y Fahrenheit se realicen correctamente
 * Utilizando las fórmulas habituales según los requisitos del proyecto.
 * * @author Ander Chans
 * @version 1.0
 */
public class ConversorTemperaturaTest {

    /**
     * Instancia del conversor para realizar las pruebas.
     */
    private final ConversorTemperatura conversor = new ConversorTemperatura();

    /**
     * Verifica la conversión de Celsius a Fahrenheit.
     * Comprueba el punto de congelación y un valor positivo estándar.
     * Igual que en la calculadora lo utilizamos para ver si está bien el resultado
     * En este caso me obliga la función a poner un delta que se utliza para marcar el error que me puedo permitir
     */
    @Test
    public void testCelsiusAFahrenheit() {
        // Caso base: 0°C = 32°F
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), 0.001, "0°C deberían ser 32°F");
        // Caso adicional: 20°C = 68°F
        assertEquals(68.0, conversor.celsiusAFahrenheit(20), 0.001, "20°C deberían ser 68°F");
    }

    /**
     * Verifica la conversión de Fahrenheit a Celsius.
     * Comprueba el punto de ebullición y el valor donde ambas escalas coinciden.
     */
    @Test
    public void testFahrenheitACelsius() {
        // Caso base: 212°F = 100°C
        assertEquals(100.0, conversor.fahrenheitACelsius(212), 0.001, "212°F deberían ser 100°C");
        // Caso adicional (curiosidad): -40°F = -40°C
        assertEquals(-40.0, conversor.fahrenheitACelsius(-40), 0.001, "-40°F deberían ser -40°C");
    }
}