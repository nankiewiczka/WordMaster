package project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StartLearningWindowController {

    public void setImportedFileName(String fileName) {
        importedFileName.textProperty().setValue(fileName);
    }

    @FXML
    private Label importedWordAmount;

    @FXML
    private Label importedFileName;

    @FXML
    private Label titleLabel;

    @FXML
    private Label amountLabel;

    @FXML
    private ChoiceBox selectLanguage;

    private ObservableList<String> options = FXCollections.observableArrayList("polski-obcy", "obcy-polski");

    @FXML
    private void initialize() {
        selectLanguage.setValue("polski-obcy");
        selectLanguage.setItems(options);
        titleLabel.textProperty().setValue("Zaimportowano plik:");
        amountLabel.textProperty().setValue("Liczba zaimportowanych słów:");

    }
    @FXML
    public void startLearning() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/learningWindow.fxml"));
            Parent root = fxmlLoader.load();
            LearningWindowController controller = fxmlLoader.getController();
            controller.setLearningMode(selectLanguage.getValue().toString());
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void endTest(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/selectFileWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
