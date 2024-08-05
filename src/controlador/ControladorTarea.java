
package controlador;

import vista.VistaTarea;

public class ControladorTarea {
    private VistaTarea vista;

    public ControladorTarea(VistaTarea vista) {
        this.vista = vista;
    }

    public void iniciarJuego() {
        System.out.println("Iniciando el juego...");
        // Lógica para iniciar el juego
    }

    public void mostrarMenu() {
        System.out.println("Mostrando el menú...");
        // Lógica para mostrar el menú
    }

    public void abrirTienda() {
        System.out.println("Abriendo la tienda...");
        // Lógica para abrir la tienda
    }
}
