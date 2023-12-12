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

    public void setArticulo(Articulo articulo, int numeroArticulo) {
        switch (numeroArticulo) {
            case 1:
                articulo1 = articulo; break;
            case 2:
                articulo2 = articulo; break;
            case 3:
                articulo3 = articulo; break;
            case 4:
                articulo4 = articulo; break;
        }
    }

    public Articulo getArticulo(int numeroArticulo) {
        switch (numeroArticulo) {
            case 1: return articulo1;
            case 2: return articulo2;
            case 3: return articulo3;
            case 4: return articulo4;
        }
        return null;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }
    // endregion

    // region métodos privados
    private boolean esArticulo(String id, int numeroArticulo) {
        Articulo articulo = getArticulo(numeroArticulo);
        return articulo != null && articulo.getId().equals(id.toUpperCase());
    }

    private boolean estaVacio(int numeroArticulo) {
        return getArticulo(numeroArticulo) == null;
    }
    // endregion

    // region CRUD

    public boolean haySitio() {
        return cantidadArticulos < LIMITE_ARTICULOS;
    }

    public boolean estaArticulo(String id) {
        for (int i = 1; i <= LIMITE_ARTICULOS; i++) {
            if (esArticulo(id, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean insertarArticulo(Articulo articulo) {
        for (int i = 1; i <= LIMITE_ARTICULOS; i++) {
            if (estaVacio(i)) {
                setArticulo(articulo, i);
                cantidadArticulos++;
                return true;
            }
        }
        return false;
    }

    public boolean sacarArticulo(String id) {
        for (int i = 1; i <= LIMITE_ARTICULOS; i++) {
            if (esArticulo(id, i)) {
                setArticulo(null, i);
                cantidadArticulos--;
                return true;
            }
        }
        return false;
    }
    // endregion

    public void pintar() {
        System.out.println("-".repeat(14));
        for (int i = 1; i <= LIMITE_ARTICULOS; i++) {
            Articulo articulo = getArticulo(i);
            String s = articulo != null?articulo.getId():" ".repeat(10);
            System.out.printf("| %10s |\n", s);
        }
        System.out.println("-".repeat(14));
    }

}
