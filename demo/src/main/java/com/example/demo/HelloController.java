package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btnIniciarJuego;

    @FXML
    private Button btnMenu;

    @FXML
    private Button btnTienda;

    @FXML
    private Button btnSalir;

    @FXML
    private void handleIniciarJuego() {
        System.out.println("Iniciar Juego clicked!");
        // Lógica para iniciar el juego
    }

    @FXML
    private void handleMenu() {
        System.out.println("Menú clicked!");
        // Lógica para abrir el menú
    }

    @FXML
    private void handleTienda() {
        System.out.println("Tienda clicked!");
        // Lógica para abrir la tienda
    }

    @FXML
    private void handleSalir() {
        System.out.println("Salir clicked!");
        // Lógica para salir de la aplicación
        System.exit(0);
    }
}
