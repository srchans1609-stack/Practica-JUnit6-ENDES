package edu.chansAnder.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ValidadorPassword.
 * Verifica el cumplimiento de las reglas de seguridad: longitud mínima,
 * Presencia de mayúsculas, números y control de nulos.
 * * @author Ander Chans
 * @version 1.0
 */
public class ValidadorPasswordTest {

    /**
     * Instancia del validador para realizar las pruebas.
     */
    private final ValidadorPassword validador = new ValidadorPassword();

    /**
     * Verifica que una contraseña que cumple todos los requisitos sea aceptada.
     * Requisitos: 8+ caracteres, al menos una mayúscula y un número.
     */
    @Test
    public void testPasswordSegura() {
        assertTrue(validador.esSegura("Abc12345"), "Debería ser true: cumple todos los requisitos");
    }

    /**
     * Verifica que se rechacen contraseñas que no alcanzan la longitud mínima.
     */
    @Test
    public void testPasswordCorta() {
        assertFalse(validador.esSegura("Ab1"), "Debería ser false: longitud inferior a 8 caracteres");
    }

    /**
     * Verifica que una contraseña sin letras mayúsculas sea rechazada.
     */
    @Test
    public void testPasswordSinMayuscula() {
        assertFalse(validador.esSegura("abc12345"), "Debería ser false: no contiene mayúsculas");
    }

    /**
     * Verifica que una contraseña sin números sea rechazada.
     */
    @Test
    public void testPasswordSinNumero() {
        assertFalse(validador.esSegura("SoloLetras"), "Debería ser false: no contiene números");
    }

    /**
     * Verifica el comportamiento ante un valor nulo.
     * Caso de prueba obligatorio según las especificaciones.
     */
    @Test
    public void testPasswordNula() {
        assertFalse(validador.esSegura(null), "Debería ser false: el valor proporcionado es nulo");
    }
}
