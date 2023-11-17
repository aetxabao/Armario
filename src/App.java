/**
 * Clase principal de la aplicación.
 * Contiene el bucle principal de ejecución.
 * @version 1.0
 * TODO: 01 - Extrae el código de los case a métodos privados y coménta todos los métodos con javadoc.
 */
public class App {

    // region constantes
    private static final int OPC_EXIT = 0;
    private static final int OPC_DISPLAY = 1;
    private static final int OPC_QUERY = 2;
    private static final int OPC_INSERT_FIRST = 3;
    private static final int OPC_INSERT_POSITION = 4;
    private static final int OPC_REMOVE = 5;
    // endregion

    private Armario armario;

    public App() {
        armario = new Armario();
    }

    public void run() {
        int numOpc;
        boolean bExit = false;

        Loader.cargarDatos(armario);

        while (!bExit) {
            Gui.mostrarMenu();
            numOpc = Gui.leerOpcion();
            bExit= ejecutarOpcion(numOpc);
        }

    }

    private boolean ejecutarOpcion(int numOpc) {
        String id;
        Posicion posicion;
        Articulo articulo;

        switch (numOpc) {

            case OPC_EXIT:
                return true;

            case OPC_DISPLAY:
                armario.pintar();
                System.out.println("Hay " + armario.getCantidadArticulos() + " artículos.");
                return false;

            case OPC_QUERY:
                id = Gui.leerIdArticulo();
                posicion = armario.estaArticulo(id);
                if (posicion != null) {
                    System.out.println("El artículo " + id + " está en la " + posicion);
                }else{
                    System.out.println("El artículo " + id + " NO está en el armario");
                }
                return false;

            case OPC_INSERT_FIRST:
                articulo = Gui.leerArticulo();
                posicion = armario.insertarArticulo(articulo);
                if (posicion != null) {
                    System.out.println("El artículo " + articulo + " se ha metido en la " + posicion);
                }else{
                    System.out.println("El artículo " + articulo + " NO se ha metido en el armario");
                }
                return false;

            case OPC_INSERT_POSITION:
                articulo = Gui.leerArticulo();
                posicion = Gui.leerPosicion();
                if (armario.insertarArticulo(articulo, posicion)) {
                    System.out.println("El artículo " + articulo + " se ha metido en la " + posicion);
                }else{
                    System.out.println("El artículo " + articulo + " NO se ha metido en el armario");
                }
                return false;

            case OPC_REMOVE:
                id = Gui.leerIdArticulo();
                posicion = armario.estaArticulo(id);
                if (posicion != null) {
                    System.out.println("El artículo " + id + " está en la " + posicion);
                    if (Gui.leerConfirmacion("Seguro que desea sacarlo [S/N]", "S")) {
                        armario.sacarArticulo(id);
                        System.out.println("Artículo sacado");
                    }else{
                        System.out.println("Artículo NO sacado");
                    }
                }else{
                    System.out.println("El artículo " + id + " NO está en el armario");
                }
                return false;

            default:
                return false;
        }
    }

}
