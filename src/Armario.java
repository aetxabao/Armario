/**
 * Clase Armario
 */
public class Armario {

    // region constantes
    private final int LIMITE_BALDAS = 4;
    // endregion

    // region atributos
    private Balda balda1;
    private Balda balda2;
    private Balda balda3;
    private Balda balda4;
    // endregion

    // region constructores

    /**
     * Constructor
     */
    public Armario() {
        // TODO: 71 - Inicializa los atributos
    }
    // endregion

    // region getter y setter

    /**
     * Devuelve la referencia al atributo que se corresponde con el parámetro
     * @param numeroBalda número de balda que se quiere obtener, ej. 3 sería el atributo balda3
     * @return referencia al atributo que se corresponde con el parámetro, puede ser null
     */
    public Balda getBalda(int numeroBalda) {
        // TODO: 72 - Devuelve la referencia al atributo que se corresponde con el parámetro (utiliza switch)
        return null;
    }

    /**
     * Devuelve la cantidad de artículos que hay en el armario
     * @return cantidad de artículos que hay en el armario, ej. 48
     */
    public int getCantidadArticulos() {
        int n = 0;
        // TODO: 73 - Contabiliza la cantidad de artículos que hay en el armario.
        return n;
    }

    /**
     * Devuelve la capacidad de artículos que hay en el armario
     * @return capacidad de artículos que hay en el armario
     */
    public int getCapacidadArticulos() {
        int n = 0;
        // TODO: 74 - Contabiliza la capacidad de artículos que hay en el armario.
        return n;
    }
    // endregion

    // region CRUD

    /**
     * Devuelve la posición de la celda en la que está el artículo con el id indicado o null si no está.
     * @param id identificador del artículo, ej. EBOOK16
     * @return posición de la celda en la que está el artículo con el id indicado o null si no está.
     */
    public Posicion estaArticulo(String id) {
        // TODO: 75 - Devuelve la posición de la celda en la que está el artículo con el id indicado o null si no está.
        return null;
    }

    /**
     * Inserta el artículo pasado como parámetro en la primera balda que tenga sitio.
     * @param articulo referencia al artículo que se quiere insertar
     * @return posición de la celda en la que se inserta o null si no se inserta.
     */
    public Posicion insertarArticulo(Articulo articulo) {
        // TODO: 76 - Inserta el artículo pasado como parámetro en la primera balda que tenga sitio.
        // Devuelve el número de celda en la que se inserta o 0 si no se inserta.
        return null;
    }

    /**
     * Inserta el artículo pasado como parámetro en la posición indicada.
     * @param articulo referencia al artículo que se quiere insertar
     * @param posicion posición de la celda en la que se quiere insertar
     * @return true si se inserta o false si no se inserta.
     */
    public boolean insertarArticulo(Articulo articulo, Posicion posicion) {
            Balda balda = getBalda(posicion.getNumeroBalda());
            return balda.insertarArticulo(articulo, posicion.getNumeroCelda());
    }

    /**
     * Saca el artículo con el id indicado de la celda en la que se encuentre.
     * @param id identificador del artículo, ej. EBOOK16
     * @return la posición de la que se saca o null si no se saca.
     */
    public Posicion sacarArticulo(String id) {
        // TODO: 77 - Saca el artículo con el id indicado de la celda en la que se encuentre.
        // Devuelve la posición de la que se saca o null si no se saca.
        return null;
    }

    // endregion

    /**
     * Pinta el armario con el formato que se indica en los ejemplos del enunciado.
     */
    public void pintar() {
        int n = getBalda(1).getCantidadCeldas();
        System.out.println("#".repeat(1 + 13 * n));
        // TODO: 78 - Pinta el armario con el formato que se indica en los ejemplos del enunciado.
        System.out.println("#".repeat(1 + 13 * n));
    }

}
