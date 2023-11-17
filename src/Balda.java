public class Balda {

    // region constantes
    private final int LIMITE_CELDAS = 5;
    // endregion

    // region atributos
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private Celda celda5;
    // endregion

    // region constructores

    /**
     *  Constructor
     */
    public Balda() {
        // TODO: 61 - Inicializa los atributos
    }
    // endregion

    // region getter y setter
    public int getCantidadCeldas() {
        return LIMITE_CELDAS;
    }

    /**
     * Devuelve la referencia al atributo que se corresponde con el parámetro
     * @param numeroCelda
     * @return
     */
    public Celda getCelda(int numeroCelda) {
        // TODO: 62 - Devuelve la referencia al atributo que se corresponde con el parámetro (utiliza switch)
        return null;
    }

    /**
     * Devuelve la cantidad de artículos que hay en la balda
     * @return
     */
    public int getCantidadArticulos() {
        int n = 0;
        // TODO: 63 - Contabiliza la cantidad de artículos que hay en una balda. Utiliza un bucle para acceder a cada celda con getCelda y el método getCantidadArticulos de celda.
        return n;
    }

    /**
     * Devuelve la capacidad de artículos que hay en la balda
     * @return capacidad de artículos que hay en la balda
     */
    public int getCapacidadArticulos() {
        int n = 0;
        // TODO: 64 - Contabiliza la capacidad de artículos que hay en una balda.
        return n;
    }
    // endregion

    // region CRUD
    /**
     * Devuelve si hay sitio en alguna celda de la balda.
     * @return
     */
    public boolean haySitio() {
        // TODO: 65 - Devuelve si hay sitio en alguna celda de la balda.
        return false;
    }

    /**
     * Devuelve si hay un artículo con el id indicado en alguna celda de la balda.
     * @param id del artículo que se quiere comprobar, ej. EBOOK16
     * @return número de celda en la que se encuentra el artículo o 0 si no se encuentra, ej. 1
     */
    public int estaArticulo(String id) {
        // TODO: 66 - Devuelve si hay un artículo con el id indicado en alguna celda de la balda.
        return 0;
    }

    /**
     * Inserta el artículo pasado como parámetro en la primera celda que tenga sitio.
     * @param articulo referencia al artículo que se quiere insertar
     * @return número de celda en la que se inserta o 0 si no se inserta, ej. 3
     */
    public int insertarArticulo(Articulo articulo) {
        // TODO: 67 - Inserta el artículo pasado como parámetro en la primera celda que tenga sitio. Devuelve el número de celda en la que se inserta o 0 si no se inserta.
        return 0;
    }

    /**
     * Inserta el artículo pasado como parámetro en la celda indicada.
     * @param articulo referencia al artículo que se quiere insertar
     * @param numeroCelda número de celda en la que se quiere insertar el artículo, ej. 3
     * @return true si se inserta, false si no se inserta
     */
    public boolean insertarArticulo(Articulo articulo, int numeroCelda) {
        Celda celda = getCelda(numeroCelda);
        return celda.insertarArticulo(articulo);
    }

    /**
     * Saca el artículo con el id indicado de la celda en la que se encuentre.
     * @param id del artículo que se quiere sacar, ej. EBOOK16
     * @return número de celda en la que se saca o 0 si no se saca, ej. 3
     */
    public int sacarArticulo(String id) {
        // TODO: 68 - Saca el artículo con el id indicado de la celda en la que se encuentre. Devuelve el número de celda en la que se saca o 0 si no se saca.
        return 0;
    }
    // endregion

    /**
     * Pinta la balda con el formato que se indica en los ejemplos del enunciado.
     * Balda vacía:
     * ------------------------------------------------------------------
     * |            |            |            |            |            |
     * |            |            |            |            |            |
     * |            |            |            |            |            |
     * |            |            |            |            |            |
     * ------------------------------------------------------------------
     * Balda llena:
     * ------------------------------------------------------------------
     * |   PROD0011 |   PROD0021 |   PROD0031 |   PROD0041 |   PROD0051 |
     * |   PROD0012 |   PROD0022 |   PROD0032 |   PROD0042 |   PROD0052 |
     * |   PROD0013 |   PROD0023 |   PROD0033 |   PROD0043 |   PROD0053 |
     * |   PROD0014 |   PROD0024 |   PROD0034 |   PROD0044 |   PROD0054 |
     * ------------------------------------------------------------------
     * Balda con la celda 2 y todos los artículos 3 quitados:
     * ------------------------------------------------------------------
     * |   PROD0011 |            |   PROD0031 |   PROD0041 |   PROD0051 |
     * |   PROD0012 |            |   PROD0032 |   PROD0042 |   PROD0052 |
     * |            |            |            |            |            |
     * |   PROD0014 |            |   PROD0034 |   PROD0044 |   PROD0054 |
     * ------------------------------------------------------------------
     */
    public void pintar() {
        System.out.println("-".repeat(1 + 13 * LIMITE_CELDAS));
        int n = getCelda(1).getCapacidadArticulos();
        // TODO: 69 - Pinta la balda con el formato que se indica en los ejemplos del enunciado.
        System.out.println("-".repeat(1 + 13 * LIMITE_CELDAS));
    }

}
