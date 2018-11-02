package project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
    private ChoiceBox selectLanguage;

    ObservableList<String> options = FXCollections.observableArrayList("polski-obcy", "obcy-polski");

    @FXML
    private void initialize() {
        selectLanguage.setValue("polski-obcy");
        selectLanguage.setItems(options);
    }
    @FXML
    public void startLearning() {
        listNameContent.textProperty().setValue("Ustawiamy");
        //TODO wywołanie zmiany okna i controller
    }

}
