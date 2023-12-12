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
    public Balda() {
        celda1 = new Celda();
        celda2 = new Celda();
        celda3 = new Celda();
        celda4 = new Celda();
        celda5 = new Celda();
    }
    // endregion

    // region getter y setter
    public int getCantidadCeldas() {
        return LIMITE_CELDAS;
    }

    public Celda getCelda(int numeroCelda) {
        switch (numeroCelda) {
            case 1: return celda1;
            case 2: return celda2;
            case 3: return celda3;
            case 4: return celda4;
            case 5: return celda5;
        }
        return null;
    }

    public int getCantidadArticulos() {
        int n = 0;
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            n += celda.getCantidadArticulos();
        }
        return n;
    }

    public int getCapacidadArticulos() {
        int n = 0;
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            n += celda.getCapacidadArticulos();
        }
        return n;
    }
    // endregion

    // region CRUD

    public boolean haySitio() {
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            if (celda.haySitio()) {
                return true;
            }
        }
        return false;
    }

    public int estaArticulo(String id) {
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            if (celda.estaArticulo(id)) {
                return i;
            }
        }
        return 0;
    }

    public int insertarArticulo(Articulo articulo) {
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            if (celda.haySitio()) {
                celda.insertarArticulo(articulo);
                return i;
            }
        }
        return 0;
    }

    public boolean insertarArticulo(Articulo articulo, int numeroCelda) {
        Celda celda = getCelda(numeroCelda);
        return celda.insertarArticulo(articulo);
    }

    public int sacarArticulo(String id) {
        for (int i = 1; i <= LIMITE_CELDAS; i++) {
            Celda celda = getCelda(i);
            if (celda.estaArticulo(id)) {
                celda.sacarArticulo(id);
                return i;
            }
        }
        return 0;
    }
    // endregion

    public void pintar() {
        System.out.println("-".repeat(1 + 13 * LIMITE_CELDAS));
        int n = getCelda(1).getCapacidadArticulos();
        for (int i = 1; i <= n; i++) {
            System.out.print("|");
            for (int j = 1; j <= LIMITE_CELDAS; j++) {
                Celda celda = getCelda(j);
                Articulo articulo = celda.getArticulo(i);
                String s = articulo != null?articulo.getId():" ".repeat(10);
                System.out.printf(" %10s |", s);
            }
            System.out.println();
        }
        System.out.println("-".repeat(1 + 13 * LIMITE_CELDAS));
    }

}
