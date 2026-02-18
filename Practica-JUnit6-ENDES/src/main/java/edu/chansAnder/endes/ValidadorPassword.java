package edu.chansAnder.endes;

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
        // Voy a utilizar la fórmula de abajo para asegurar y obligarr al usuario a poner esos caracteres
        return password.matches("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
        /**
         * Utilizo el Regex para facilitar el proceso de filtro en vez de un bucle que sería más tardio
         * Pongo esto: (?=.*[0-9]) para que se utilice los numeros de 0 al 9
         * (?=.*[A-Z]) esto para que pongamos letras desde la a hasta la z en mayúscula
         * {8,}$") esto para que sean como mínimo 8 caracteres
         * y no podemos poner solo letras ni solo números
         */
    }
}