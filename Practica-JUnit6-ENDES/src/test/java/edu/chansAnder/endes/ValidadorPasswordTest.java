package edu.chansAnder.endes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para validar la lógica de contraseñas y asegurar cobertura total.
 */
public class ValidadorPasswordTest {

    private final ValidadorPassword validador = new ValidadorPassword();

    /**
     * Test para casos donde la contraseña debe ser aceptada.
     */
    @Test
    public void testPasswordSegura() {
        assertTrue(validador.esSegura("@Ander12345"));
    }

    /**
     * Test para casos de fallo. Cubre nulos, vacíos, cortos y falta de caracteres obligatorios.
     * Esto llevará la barra de cobertura al 100%.
     */
    @Test
    public void testPasswordInsegura() {
        assertFalse(validador.esSegura(null), "Fallo esperado: Nulo");
        assertFalse(validador.esSegura("   "), "Fallo esperado: Espacios en blanco");
        assertFalse(validador.esSegura("Short1"), "Fallo esperado: Menos de 8 caracteres");
        assertFalse(validador.esSegura("todominusculas1"), "Fallo esperado: Sin mayúsculas");
        assertFalse(validador.esSegura("SINNUMEROS"), "Fallo esperado: Sin números");
        assertFalse(validador.esSegura("Pass Word1"), "Fallo esperado: Contiene espacios");
    }
}
