
public class Producto {
    private int identificador;
    private String nombre;
    private double precio;
    private long existencias;

    // Constructor
    public Producto(int identificador, String nombre, double precio, long existencias) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getExistencias() {
        return existencias;
    }

    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }

    // Métodos para mostrar la información
    public void mostrarNombre() {
        System.out.println("Nombre del producto: " + nombre);
    }

    public void mostrarPrecio() {
        System.out.println("Precio del producto: " + precio);
    }

    public void mostrarExistencias() {
        System.out.println("Existencias del producto: " + existencias);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + ''' +
                ", precio=" + precio +
                ", existencias=" + existencias +
                '}';
    }
}
