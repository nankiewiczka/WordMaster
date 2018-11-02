package project.controller;

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
import project.Main;
import project.model.LearningEntity;
import project.model.LearningEntityFromNative;
import project.model.LearningUnit;

public class StartLearningWindowController {
    private LearningUnit learningUnit;

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

    private ObservableList<String> options = FXCollections.observableArrayList("polish-foreign", "foreign-polish");

    @FXML
    private void initialize() {
        selectLanguage.setValue("polish-foreign");
        selectLanguage.setItems(options);
        titleLabel.textProperty().setValue("Imported file:");
        amountLabel.textProperty().setValue("Number of imported words:");
    }

    @FXML
    public void startLearning() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/learningWindow.fxml"));
            Parent root = fxmlLoader.load();
            LearningWindowController controller = fxmlLoader.getController();
            LearningEntity learningEntity = getLearningEntity();
            controller.setLearningEntity(learningEntity);
            controller.setWordToGuess(learningEntity.getWordForLabel());
            controller.setRemain("0/"+Integer.toString(learningEntity.getWordAmount()));
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private LearningEntity getLearningEntity() {
        if(selectLanguage.getValue().toString().equals("polish-foreign"))
            return new LearningEntityFromNative(learningUnit);
        else return new LearningEntityFromNative(learningUnit); //TODO poprawić
    }

    @FXML
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

    public void setImportedFileName(String fileName) {
        importedFileName.textProperty().setValue(fileName);
    }

    public void setLearningUnit(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
    }

    public void setImportedWordAmount(String wordAmount) {
        importedWordAmount.textProperty().setValue(wordAmount);
    }
}
