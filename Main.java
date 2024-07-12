
public class Main {
    public static void main(String[] args) {
        // Crear varios objetos Producto con configuraciones iniciales distintas
        Producto producto1 = new Producto(1, "Manzana", 0.5, 100);
        Producto producto2 = new Producto(2, "Pan", 1.0, 50);
        Producto producto3 = new Producto(3, "Leche", 1.5, 30);

        // Mostrar información de los productos
        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();
        System.out.println();

        producto2.mostrarNombre();
        producto2.mostrarPrecio();
        producto2.mostrarExistencias();
        System.out.println();

        producto3.mostrarNombre();
        producto3.mostrarPrecio();
        producto3.mostrarExistencias();
        System.out.println();

        // Modificar y mostrar información actualizada de un producto
        producto1.setPrecio(0.6);
        producto1.setExistencias(90);
        System.out.println("Información actualizada del producto1:");
        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();
    }
}
