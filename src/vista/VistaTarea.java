
package vista;

import controlador.ControladorTarea;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaTarea extends Application {
    private ControladorTarea controlador;

    @Override
    public void start(Stage primaryStage) {
        controlador = new ControladorTarea(this);
        primaryStage.setTitle("Gestión de Tareas");

        // Imagen de fondo
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/market_scene.png")));
        imageView.setFitWidth(300);
        imageView.setFitHeight(200);

        // Botones
        Button btnIniciarJuego = new Button("Iniciar Juego");
        Button btnMenu = new Button("Menú");
        Button btnTienda = new Button("Tienda");
        Button btnSalir = new Button("Salir");

        // Eventos de los botones
        btnIniciarJuego.setOnAction(e -> controlador.iniciarJuego());
        btnMenu.setOnAction(e -> controlador.mostrarMenu());
        btnTienda.setOnAction(e -> controlador.abrirTienda());
        btnSalir.setOnAction(e -> primaryStage.close());

        // Layout
        VBox root = new VBox(10, imageView, btnIniciarJuego, btnMenu, btnTienda, btnSalir);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
