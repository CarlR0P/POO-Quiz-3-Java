public class Juegos {
    /**
     * Atributos:
     */
    String nombre;
    String genero;
    String numeroj;
    String tipoj;

    /**
     * Constructor de la clase
     * @param nombre Es el nombre del juego
     * @param genero Es el genero del juego
     * @param numeroj Es el numero de jugadores que pueden jugar en simultaneo
     * @param tipoj Indica si es un juego que debe permanecer conectado a internet (Online) o si no se requiere (Offline)
     */

    Juegos(String nombre, String genero, String numeroj, String tipoj) {
        this.nombre = nombre;
        this.genero = genero;
        this.numeroj = numeroj;
        this.tipoj = tipoj;
    }
    /**
     * Metodo que imprime los datos del juego
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    void mostrarcarac () {System.out.println(nombre + " es un juego " + numeroj + " del genero "+ genero +" de tipo "+ tipoj);}
}