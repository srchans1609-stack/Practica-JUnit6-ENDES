package edu.chans.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *ander
 * Clase de pruebas para asegurar la precisión de las conversiones de temperatura.
 */
public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    /**
     * Verifica la conversión de Celsius a Fahrenheit.
     */
    @Test
    public void testCelsiusAFahrenheit() {
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), "0°C deberían ser 32°F");
    }

    /**
     * Verifica la conversión de Fahrenheit a Celsius.
     */
    @Test
    public void testFahrenheitACelsius() {
        assertEquals(100.0, conversor.fahrenheitACelsius(212), "212°F deberían ser 100°C");
    }
}