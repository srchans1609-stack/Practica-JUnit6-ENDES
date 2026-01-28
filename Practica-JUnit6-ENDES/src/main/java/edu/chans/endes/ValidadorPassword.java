package edu.chans.endes;

/**
 * Clase para validar la seguridad de contraseñas basándose en criterios específicos.
 */
public class ValidadorPassword {

    /**
     * Verifica si una contraseña es segura.
     * Criterios: No nula, mínimo 8 caracteres, contiene mayúsculas y números[cite: 57].
     * @param password La contraseña a validar.
     * @return true si cumple los criterios, false en caso contrario.
     */
    public boolean esSegura(String password) {
        if (password == null) return false;
        // Expresión regular recomendada [cite: 58]
        return password.matches("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
    }
}