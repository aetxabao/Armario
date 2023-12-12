public class Posicion {

    private int numeroBalda;
    private int numeroCelda;

    public Posicion(int numeroBalda, int numeroCelda) {
        this.numeroBalda = numeroBalda;
        this.numeroCelda = numeroCelda;
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

//    public String toString() {
//        return "(" + numeroBalda + "," + numeroCelda + ")";
//    }
    public String toString() {
        return "balda " + numeroBalda + " celda " + numeroCelda;
    }

}
