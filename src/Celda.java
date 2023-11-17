/**
 * Clase Celda
 */
public class Celda {

    // region constantes
    private final int LIMITE_ARTICULOS = 4;
    // endregion

    // region atributos
    private int cantidadArticulos;

    private Articulo articulo1;
    private Articulo articulo2;
    private Articulo articulo3;
    private Articulo articulo4;
    // endregion


    public Celda() {
        this.cantidadArticulos = 0;
    }

    // region getter y setter
    public int getCapacidadArticulos() {
        return LIMITE_ARTICULOS;
    }

    /**
     * Asigna al atributo articulo correspondiente al número de artículo el artículo pasado como parámetro
     * @param articulo referencia al artículo que se quiere asignar, puede ser null
     * @param numeroArticulo número del artículo que se quiere asignar, ej. 3 sería el atributo articulo3
     */
    public void setArticulo(Articulo articulo, int numeroArticulo) {
        // TODO: 51 - El atributo con el número de artículo indicado en el parámetro apuntará al artículo pasado como parámetro (utiliza switch)
    }

    /**
     * Devuelve la referencia al atributo artículo que hace referencia el parámetro
     * @param numeroArticulo número del artículo que se quiere obtener, ej. 3 sería el atributo articulo3
     * @return referencia al artículo que se quiere obtener, puede ser null
     */
    public Articulo getArticulo(int numeroArticulo) {
        // TODO: 52 - Devuelve la referencia al atributo artículo que hace referencia el parámetro (utiliza switch)
        return null;
    }

    /**
     * Devuelve la cantidad de artículos que hay en la celda, de 0 a LIMITE_ARTICULOS
     * @return
     */
    public int getCantidadArticulos() {
        return cantidadArticulos;
    }
    // endregion

    // region métodos privados

    /**
     * Devuelve si el atributo artículo al que hace referencia el parámetro tiene el id que se indica si es que ese artículo no es null
     * @param id del artículo que se quiere comprobar, ej. EBOOK16
     * @param numeroArticulo número del artículo que se quiere comprobar, ej. 3 sería el atributo articulo3
     * @return
     */
    private boolean esArticulo(String id, int numeroArticulo) {
        // TODO: 53 - Devuelve si el atributo artículo al que hace referencia el parámetro tiene el id que se indica si es que ese artículo no es null
        return false;
    }

    /**
     * Devuelve si el atributo artículo al que hace referencia el parámetro es null
     * @param numeroArticulo
     * @return
     */
    private boolean estaVacio(int numeroArticulo) {
        // TODO: 54 - Si el atributo artículo al que hace referencia el parámetro exist (utiliza getArticulo)
        return true;
    }
    // endregion

    // region CRUD

    /**
     * Devuelve si hay sitio en la celda para insertar un artículo
     * @return true si hay sitio, false si no hay sitio
     */
    public boolean haySitio() {
        // TODO: 55 - Si hay sitio en la celda
        return true;
    }

    /**
     * Devuelve si hay un artículo con el id indicado
     * @param id del artículo que se quiere comprobar, ej. EBOOK16
     * @return true si hay un artículo con el id indicado, false si no hay un artículo con el id indicado
     */
    public boolean estaArticulo(String id) {
        // TODO: 56 - Recorre con un bucle el número de artículos y utilizando el método esArticulo comprueba si el artículo con el id indicado existe
        return false;
    }

    /**
     * Inserta el artículo pasado como parámetro en la celda si hay sitio
     * @param articulo referencia al artículo que se quiere insertar
     * @return true si se inserta, false si no se inserta
     */
    public boolean insertarArticulo(Articulo articulo) {
        // TODO: 57 - Recorre con un bucle el número de artículos y si uno esta vacío asigna el artículo pasado como parámetro y devuelve true después de incrementar la cantidad de artículos, sino se inserta devuelve false
        return false;
    }

    /**
     * Saca el artículo con el id indicado poniendo la referencia del atributo articulo a null y
     * devuelve true después de decrementar la cantidad de artículos, si no se saca devuelve false
     * @param id
     * @return
     */
    public boolean sacarArticulo(String id) {
        // TODO: 58 - Saca el artículo con el id indicado poniendo la referencia del atributo articulo a null y devuelve true después de decrementar la cantidad de artículos, si no se saca devuelve false
        return false;
    }
    // endregion

    /**
     * Pinta la celda con el formato que se indica en los ejemplos del enunciado.
     * Utiliza un bucle y el método getArticulo para acceder a cada artículo.
     * Celda vacía:
     * --------------
     * |            |
     * |            |
     * |            |
     * |            |
     * --------------
     * Celda con 4 artículos:
     * --------------
     * |   PROD0001 |
     * |   PROD0002 |
     * |   PROD0003 |
     * |   PROD0004 |
     * --------------
     * Celda tras sacar 2 artículos:
     * --------------
     * |   PROD0001 |
     * |            |
     * |   PROD0003 |
     * |            |
     * --------------
     */
    public void pintar() {
        // TODO: 59 - Pinta la celda con el formato que se indica en los ejemplos del enunciado. Utiliza un bucle y el método getArticulo para acceder a cada artículo.
    }

}
