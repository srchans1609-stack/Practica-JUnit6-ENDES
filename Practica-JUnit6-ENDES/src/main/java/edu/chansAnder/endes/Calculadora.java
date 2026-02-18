package edu.chansAnder.endes;

/**
 * Clase que proporciona operaciones matemáticas básicas como suma, resta,
 * multiplicación y división.
 * * @author Ander Chans
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza la suma de dos números reales.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return El resultado de la suma.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números reales.
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return El resultado de la resta.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números reales.
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return El resultado del producto.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return El resultado de la división.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}
