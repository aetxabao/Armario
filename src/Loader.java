import java.util.Random;

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
    private static int getAleatorio(int hasta) {
        return generadorAleatorio.nextInt(hasta) + 1;
    }

    private static int getAleatorio() {
        return generadorAleatorio.nextInt(MIN_PRECIO, MAX_PRECIO + 1);
    }

    private static String getTipoArticulo(int tipo) {
        switch (tipo) {
            case 1: return "RELOJ";
            case 2: return "MOVIL";
            case 3: return "TABLE";
            case 4: return "EBOOK";
            case 5: return "LAMPA";
            default: return "CAMAR";
        }
    }
    // endregion

}
