
package modelo;

public class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        String estado = completada ? "Completada" : "Pendiente";
        return String.format("Tarea %d: %s (%s)", id, titulo, estado);
    }
}
