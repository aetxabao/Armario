/**
 * Clase Posicion
 */
public class Posicion {

    private int numeroBalda;
    private int numeroCelda;

    public Posicion(int numeroBalda, int numeroCelda) {
        // TODO: 41 - Constructor con parámetros utilizando this.
    }

    public Posicion() {
        // TODO: 42 - Constructor sin parámetros que inicializa la balda y la celda a 0 utilizando this().
    }

    // region getter y setter
    public int getNumeroBalda() {
        return numeroBalda;
    }

    public void setNumeroBalda(int numeroBalda) {
        this.numeroBalda = numeroBalda;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }
    // endregion

    /**
     * Devuelve una cadena con el número de balda y el número de celda, ej. balda 3 celda 2
     * @return cadena con el número de balda y el número de celda, ej. balda 3 celda 2
     */
    public String toString() {
        // TODO: 43 - Devuelve una cadena con el número de balda y el número de celda, ej. balda 3 celda 2
        return "";
    }

}
