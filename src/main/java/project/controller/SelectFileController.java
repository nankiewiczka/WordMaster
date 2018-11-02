package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import project.Main;
import project.data.DataCSVProvider;
import project.model.LearningUnit;

import java.io.File;

public class SelectFileController {

    @FXML
    public Button chooseListBtn;

    @FXML
    public void chooseList(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/startLearningWindow.fxml"));
            Parent root = fxmlLoader.load();
            StartLearningWindowController controller = fxmlLoader.getController();
            controller.setImportedFileName(selectedFile.getAbsolutePath());
            LearningUnit learningUnit = new LearningUnit(new DataCSVProvider(selectedFile.getAbsolutePath().toString()).getData());
            controller.setLearningUnit(learningUnit);
            controller.setImportedWordAmount(Integer.toString(learningUnit.getWordsAmount()));
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
