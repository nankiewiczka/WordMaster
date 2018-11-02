package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {

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
            controller.setFileName(selectedFile.getAbsolutePath());
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        }
        else {
//            actionStatus.setText("File selection cancelled.");
        }
    }
}
