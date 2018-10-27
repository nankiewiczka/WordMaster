package main.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    public Button chooseListBtn;

    @FXML
    public void chooseList(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            // wywołanie nowego okna
//            actionStatus.setText("File selected: " + selectedFile.getName());
        }
        else {
//            actionStatus.setText("File selection cancelled.");
        }
    }
}
