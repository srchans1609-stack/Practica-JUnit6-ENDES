package edu.chansAnder.endes;

/**
 * Clase para realizar conversiones entre escalas de temperatura Celsius y Fahrenheit[cite: 60].
 */
public class ConversorTemperatura {

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius Grados en escala Celsius.
     * @return Grados equivalentes en Fahrenheit.
     * simplemente utilizo la formula de conversión de celsius a fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit Grados en escala Fahrenheit.
     * @return Grados equivalentes en Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
