package project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import java.io.File;

public class SelectFileController {

    @FXML
    public Button chooseListBtn;

    @FXML
    public void chooseList() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose file with words");
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            Controller.showStartLearningWindowWhenNoLearningUnit(selectedFile);
        }
    }
}
