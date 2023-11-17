import java.util.Random;

/**
 * Clase que carga el armario con artículos de forma un tanto aleatoria.
 */
public class Loader {

    // region constantes
    private static final int NUM_ARTICULOS_INI = 50;
    private static final int NUM_TIPO_ARTICULOS = 6;
    private static final int NUM_BALDAS = 4;
    private static final int NUM_CELDAS = 5;
    private static final int MIN_PRECIO = 100;
    private static final int MAX_PRECIO = 1200;
    // endregion

    // region atributos
    private static int numeroArticulo = 1;
    private static Random generadorAleatorio;
    // endregion

    /**
     * Carga el armario con hasta NUM_ARTICULOS_INI artículos.
     * Los artículos se insertan en posiciones aleatorias del armario.
     * Los artículos se crean con un precio aleatorio entre MIN_PRECIO y MAX_PRECIO.
     * Los artículos se crean con un id secuencial único.
     * Los artículos se crean con un nombre compuesto por el tipo y el id.
     * Los artículos se crean con un tipo aleatorio entre los 6 tipos de artículos.
     * Los artículos se crean con una posición aleatoria entre las 4 baldas y las 5 celdas.
     * @param armario referencia al objeto sobre el que se cargan los artículos.
     */
    public static void cargarDatos(Armario armario) {
        Articulo articulo;
        boolean b;
        int numeroTipo, numeroBalda, numeroCelda, precioArticulo;
        String nombreTipo, idArticulo, nombreArticulo;
        Posicion posicion;
        generadorAleatorio = new Random();
        for (int i = 0; i < NUM_ARTICULOS_INI; i++) {
            numeroTipo = getAleatorio(NUM_TIPO_ARTICULOS);
            nombreTipo = getTipoArticulo(numeroTipo);
            numeroBalda = getAleatorio(NUM_BALDAS);
            numeroCelda = getAleatorio(NUM_CELDAS);
            precioArticulo = getAleatorio();
            idArticulo = String.format("%s%02d",nombreTipo, numeroArticulo);
            nombreArticulo = "Artículo de tipo " + nombreTipo + " con id " + idArticulo;
            articulo = new Articulo(idArticulo, nombreArticulo, precioArticulo);
            posicion = new Posicion(numeroBalda, numeroCelda);
            //System.out.println(posicion);
            b = armario.insertarArticulo(articulo, posicion);
            if (b) {
                numeroArticulo++;
            }
        }
    }

    // region métodos privados


    /**
     * Devuelve un número aleatorio entre 1 y "hasta" ambos inclusive.
     * @param hasta límite superior del número aleatorio.
     * @return número aleatorio entre 1 y "hasta" ambos inclusive.
     */
    private static int getAleatorio(int hasta) {
        // TODO: 21 - Genera un número aleatorio entre 1 y "hasta" ambos inclusive utilizando la clase Random
        return 0;
    }

    /**
     * Devuelve un número aleatorio entre MIN_PRECIO y MAX_PRECIO ambos inclusive.
     * @return número aleatorio entre MIN_PRECIO y MAX_PRECIO ambos inclusive.
     */
    private static int getAleatorio() {
        // TODO: 22 - Genera un número aleatorio entre MIN_PRECIO y MAX_PRECIO ambos inclusive utilizando la clase Random
        return 0;
    }

    /**
     * Devuelve el nombre del tipo de artículo en función del número recibido.
     * @param tipo número del tipo de artículo, ej. 3
     * @return nombre del tipo de artículo, ej. TABLE
     */
    private static String getTipoArticulo(int tipo) {
        // TODO: 23 - Devuelve el nombre del tipo de artículo en función del número recibido.
        // 1 -> RELOJ, 2 -> MOVIL, 3 -> TABLE, 4 -> EBOOK, 5 -> LAMPA, 6 -> CAMAR
        return "";
    }
    // endregion

}
