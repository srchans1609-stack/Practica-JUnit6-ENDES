package edu.chansAnder.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para validar la lógica de seguridad de contraseñas.
 */
public class ValidadorPasswordTest {

    private final ValidadorPassword validador = new ValidadorPassword();

    /**
     * Verifica que una contraseña que cumple todos los requisitos sea aceptada.
     */
    @Test
    public void testPasswordSegura() {
        assertTrue(validador.esSegura("Abc12345"), "Debería ser true: tiene 8 caracteres, mayúscula y número");
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
     */
    @Test
    public void testPasswordNula() {
        assertFalse(validador.esSegura(null), "Debería ser false: el valor es nulo");
    }
}
