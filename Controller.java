public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        view.getButton().setOnAction(e -> onButtonClick());
    }

    private void onButtonClick() {
        view.setLabelText("Mi primer programa en JavaFx: " + model.getNombreAlumno());
    }
}
