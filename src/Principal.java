/**
 * Primera clase en ser ejecutada
 */
public class Principal {
    /**
     * Primer método que se ejecuta en mi aplicación
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */

    public static void main(String[] args) {

        Juegos callofduty = new Juegos("Call of Duty", "Shooter", "Multi-player", "Online/Offline.");
        Juegos lol = new Juegos("League of Legends", "MOBA","Muti-player","Online");
        Juegos nfs = new Juegos("Need For Speed", "Conduccion", "Single-player","Online/Offline.");

        callofduty.mostrarcarac();
        lol.mostrarcarac();
        nfs.mostrarcarac();
    }
}