package project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class StartLearningWindowController {
    @FXML
    private Button startButton;

    @FXML
    private Button endButton;

    @FXML
    private Label wordAmountContent;

    @FXML
    private Label listNameContent;

    @FXML
    public void startLearning() {
        listNameContent.textProperty().setValue("Ustawiamy");
        //TODO wywołanie zmiany okna i controller
    }

}
