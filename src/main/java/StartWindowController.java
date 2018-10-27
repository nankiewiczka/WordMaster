package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class StartWindowController {

    @FXML
    private Button startButton;

    @FXML
    private Label listNameContent;

    @FXML
    private Button endButton;

    @FXML
    private Label wordAmountContent;

    @FXML
    public void startLearning() {
        listNameContent.textProperty().setValue("hejka");
    }


}
