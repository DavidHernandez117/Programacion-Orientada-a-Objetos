import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Model model = new Model("David Hernandez Martinez");
        View view = new View(primaryStage);
        Controller controller = new Controller(model, view);

        view.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
