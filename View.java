import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
    private Stage stage;
    private Label label;
    private Button button;

    public View(Stage stage) {
        this.stage = stage;
        initUI();
    }

    private void initUI() {
        stage.setTitle("Mercado");

        label = new Label("Mi primer programa en JavaFx: David Hernandez Martinez");
        button = new Button("Ejecutar");

        VBox root = new VBox(10, label, button);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
    }

    public void show() {
        stage.show();
    }

    public Button getButton() {
        return button;
    }

    public void setLabelText(String text) {
        label.setText(text);
    }
}
