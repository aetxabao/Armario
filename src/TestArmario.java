public class TestArmario {

    public static void main(String[] args) {
        Posicion posicion;
        int num;
        String id;

        Armario armario = new Armario();
        System.out.println("Armario vacío:");
        armario.pintar();

        for (int i = 1; i <= 4; i++) {          //baldas
            for (int j = 1; j <= 5; j++) {       //celdas
                for (int k = 1; k <= 4; k++) {   //articulos
                    id = "PROD0"+i+j+k;
                    armario.insertarArticulo(new Articulo(id, "Producto " + id, 100*k ));
                }
            }
        }
        System.out.println("Armario lleno:");
        armario.pintar();

        num = 3; //balda
        for (int j = 1; j <= 5; j++) {       //celdas
            for (int k = 1; k <= 4; k++) {   //articulos
                id = "PROD0"+num+j+k;
                armario.sacarArticulo(id);
            }
        }
        for (int i = 1; i <= 4; i++) {          //baldas
            num = 2; //celda
            for (int k = 1; k <= 4; k++) {   //articulos
                id = "PROD0"+i+num+k;
                armario.sacarArticulo(id);
            }
        }
        for (int i = 1; i <= 4; i++) {          //baldas
            for (int j = 1; j <= 5; j++) {       //celdas
                num = 4; //articulo
                id = "PROD0"+i+j+num;
                armario.sacarArticulo(id);
            }
        }
        System.out.println("Armario con la balda 3, las celdas 2 y todos los artículos 4 quitados:");
        armario.pintar();

        System.out.println("Hay " + armario.getCantidadArticulos() + " artículos de una capacidad de " + armario.getCapacidadArticulos());
        id = "PROD0243";
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
        id = "PROD0454";
        posicion = armario.estaArticulo(id);
        if (posicion != null) {
            System.out.println("El artículo " + id + " está en la " + posicion);
        }else{
            System.out.println("El artículo " + id + " NO está en el armario");
        }
    }

}
