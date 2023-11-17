import java.util.Scanner;

/**
 * Clase que contiene los métodos para mostrar el menú y leer datos por teclado.
 */
public class Gui {

    public static void mostrarMenu() {
        System.out.println("*****************************************");
        System.out.println("*       A   R   M   A   R   I   O       *");
        System.out.println("*****************************************");
        System.out.println(" 1. Ver armario");
        System.out.println(" 2. Consultar artículo");
        System.out.println(" 3. Insertar artículo primer hueco");
        System.out.println(" 4. Insertar artículo en una posición");
        System.out.println(" 5. Sacar artículo");
        System.out.println(" 0. Exit");
        System.out.println("*****************************************");
    }

    /**
     * Lee una opción del menú, ej.
     * Opción: 1
     * @return Valor entero de la opción leída, ej. 1
     */
    public static int leerOpcion() {
        // TODO: 11 - Muestra el mensaje que pide una opción y lee utilizando un scanner la opción.
        return 0;
    }

    /**
     * Lee el identificador de un artículo, ej.
     * Identificador del artículo: EBOOK16
     * @return Identificador del artículo leído, ej. EBOOK16
     */
    public static String leerIdArticulo() {
        // TODO: 12 - Muestra el mensaje que pide el id del artículo y lo lee de la entrada estándar.
        return "";
    }

    /**
     * Lee los datos de un artículo, ej.
     * Identificador del artículo: ARTI99
     *        Nombre del artículo: Artículo 99
     *        Precio del artículo: 100
     * @return Instancia del artículo con los datos leídos.
     */
    public static Articulo leerArticulo() {
        // TODO: 13 - Lee el identificador, nombre y precio del artículo (los mensajes terminan alineados como en el ejemplo) y devuelve una instancia del artículo con esos valores.
        return new Articulo();
    }

    /**
     * Lee los datos de una posición, ej.
     *   Número de la balda: 1
     *   Número de la celda: 3
     * @return Instancia de la posición con los datos leídos.
     */
    public static Posicion leerPosicion() {
        // TODO: 14 - Lee el número de balda y celda y devuelve una instancia de la posición con esos valores.
        return new Posicion();
    }

    /**
     * Muestra un mensaje y lee de la entrada estándar la respuesta, ej.
     * Seguro que desea sacarlo [S/N]: s
     * @param txt "Seguro que desea sacarlo [S/N]: "
     * @param iniConfirmacion ej. "S"
     * @return Si empieza por iniConfirmacion en mayúsculas o minúsculas devuelve true, ej. true
     */
    public static boolean leerConfirmacion(String txt, String iniConfirmacion) {
        // TODO: 15 - Muestra un mensaje con el texto txt y lee de la entrada estándar la respuesta. Si empieza por iniConfirmacion en mayúsculas o minúsculas devuelve true.
        return true;
    }

}
