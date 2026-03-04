package edu.chansAnder.endes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase encargada de la validación de seguridad de contraseñas.
 * Proporciona métodos para verificar si una cadena cumple con los estándares
 * de seguridad definidos para la aplicación.
 * * @author Ander Chans
 * @version 1.0
 */
public class ValidadorPassword {

    /** Patrón Regex: Mínimo 8 caracteres, una Mayúscula y un Número. Sin espacios. */
    private static final String PATTERN_REGEX = "^(?=.*[0-9])(?=.*[A-Z])(?=\\S+$).{8,}$";

    /**
     * Valida si una contraseña es segura basándose en criterios específicos.
     * Criterios:
     * <ul>
     * <li>No puede ser nula ni estar vacía.</li>
     * <li>Debe tener al menos 8 caracteres.</li>
     * <li>Debe contener al menos una letra mayúscula.</li>
     * <li>Debe contener al menos un dígito numérico.</li>
     * <li>No se permiten espacios en blanco.</li>
     * </ul>
     *
     * @param password El String de la contraseña a validar.
     * @return {@code true} si la contraseña cumple todos los criterios; {@code false} en caso contrario.
     */
    public boolean esSegura(String password) {
        // Validación de nulidad y vacío para asegurar cobertura total
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        Pattern pattern = Pattern.compile(PATTERN_REGEX);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}