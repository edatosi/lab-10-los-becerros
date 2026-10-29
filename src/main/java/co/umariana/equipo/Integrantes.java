package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "Becerros";
    public static final String LEMA = "Becerros hasta morir, cuchillos hasta el final";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("gabhernandez125-wq", "Gabriela Hernandez", "Bienvenidos al trabajo en equipo. Agreguen su tarjeta!", "#6e72ed"));
        // >>> AGREGUE SU TARJETA DEBAJO DE ESTA LÍNEA <<<

        return lista;
    }
}
