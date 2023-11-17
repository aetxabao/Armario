public class TestBalda {

    public static void main(String[] args) {
        int num;
        String id;

        Balda balda = new Balda();
        System.out.println("Balda vacía:");
        balda.pintar();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                id = "PROD00"+i+j;
                balda.insertarArticulo(new Articulo(id, "Producto " + id, 100*j ));
            }
        }
        System.out.println("Balda llena:");
        balda.pintar();

        for (int i = 1; i <= 4; i++) {
            id = "PROD002" + i;
            balda.sacarArticulo(id);
        }
        for (int i = 1; i <= 5; i++) {
            id = "PROD00"+i+"3";
            balda.sacarArticulo(id);
        }
        System.out.println("Balda con la celda 2 y todos los artículos 3 quitados:");
        balda.pintar();

        System.out.println("Hay " + balda.getCantidadArticulos() + " artículos de una capacidad de " + balda.getCapacidadArticulos());
        id = "PROD0032";
        num = balda.estaArticulo(id);
        if (num != 0) {
            System.out.println("El artículo " + id + " está en la celda " + num);
        }else{
            System.out.println("El artículo " + id + " NO está en la balda");
        }
        id = "PROD0053";
        num = balda.estaArticulo(id);
        if (num != 0) {
            System.out.println("El artículo " + id + " está en la celda " + num);
        }else{
            System.out.println("El artículo " + id + " NO está en la balda");
        }
    }

}
