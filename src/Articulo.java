public class Articulo {

    // region atributos
    private String id;
    private String nombre;
    private double precio;
    // endregion

    // region constructores
    /**
     * Constructor con parámetros
     * @param id identificador del artículo, ej. EBOOK16
     * @param nombre nombre del artículo, ej. Artículo 16
     * @param precio precio del artículo, ej. 100
     */
    public Articulo(String id, String nombre, double precio) {
        // TODO: 31 - Inicializa los atributos con los parámetros pasados. El id se guarda en mayúsculas.
    }

    /**
     * Constructor sin parámetros
     */
    public Articulo() {
        // TODO: 32 - Inicializa los atributos utilizando this() con cadenas vacías y valores a cero.
    }
    // endregion

    // region getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // endregion

    /**
     * Devuelve una cadena sólo con el id. ej. EBOOK16
     * @return cadena sólo con el id. ej. EBOOK16
     */
    @Override
    public String toString() {
        // TODO: 33 - Devuelve una cadena sólo con el id. ej. EBOOK16
        return id;
    }

}
