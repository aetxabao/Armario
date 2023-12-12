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
    public Armario() {
        balda1 = new Balda();
        balda2 = new Balda();
        balda3 = new Balda();
        balda4 = new Balda();
    }
    // endregion

    // region getter y setter
    public Balda getBalda(int numeroBalda) {
        switch (numeroBalda) {
            case 1: return balda1;
            case 2: return balda2;
            case 3: return balda3;
            case 4: return balda4;
        }
        return null;
    }

    public int getCantidadArticulos() {
        int n = 0;
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            Balda balda = getBalda(i);
            n += balda.getCantidadArticulos();
        }
        return n;
    }

    public int getCapacidadArticulos() {
        int n = 0;
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            Balda balda = getBalda(i);
            n += balda.getCapacidadArticulos();
        }
        return n;
    }
    // endregion

    // region CRUD
    public Posicion estaArticulo(String id) {
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            Balda balda = getBalda(i);
            int j = balda.estaArticulo(id);
            if (j != 0) {
                return new Posicion(i, j);
            }
        }
        return null;
    }

    public Posicion insertarArticulo(Articulo articulo) {
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            Balda balda = getBalda(i);
            if (balda.haySitio()) {
                int j = balda.insertarArticulo(articulo);
                return new Posicion(i, j);
            }
        }
        return null;
    }

    public boolean insertarArticulo(Articulo articulo, Posicion posicion) {
            Balda balda = getBalda(posicion.getNumeroBalda());
            return balda.insertarArticulo(articulo, posicion.getNumeroCelda());
    }

    public Posicion sacarArticulo(String id) {
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            Balda balda = getBalda(i);
            int j = balda.sacarArticulo(id);
            if (j != 0) {
                return new Posicion(i, j);
            }
        }
        return null;
    }

    // endregion

    public void pintar() {
        int n = getBalda(1).getCantidadCeldas();
        System.out.println("#".repeat(1 + 13 * n));
        for (int i = 1; i <= LIMITE_BALDAS; i++) {
            getBalda(i).pintar();
        }
        System.out.println("#".repeat(1 + 13 * n));
    }


}
