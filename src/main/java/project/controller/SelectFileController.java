package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;

public class SelectFileController {

    @FXML
    public Button chooseListBtn;

    @FXML
    public void chooseList(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            Controller.showStartLearningWindowWhenNoLearningUnit(selectedFile);
        }
    }


}
