package project.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import project.Main;
import project.model.LearningEntity;
import project.model.LearningEntityFromNative;
import project.model.LearningUnit;

public class StartLearningWindowController {

    private LearningUnit learningUnit;
    private ObservableList<String> options = FXCollections.observableArrayList("polish-foreign", "foreign-polish");

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

    @FXML
    private void initialize() {
        selectLanguage.setValue("polish-foreign");
        selectLanguage.setItems(options);
        titleLabel.textProperty().setValue("Imported file:");
        amountLabel.textProperty().setValue("Number of imported words:");
    }

    @FXML
    public void startLearning() {
        Controller.showLearningWindow(getLearningEntity());
    }

    @FXML
    public void endLearning() {
        Controller.showSelectFileWindow(Main.getMainStage());
    }

    private LearningEntity getLearningEntity() {
        if(selectLanguage.getValue().toString().equals("polish-foreign"))
            return new LearningEntityFromNative(learningUnit);
        else
            return new LearningEntityFromNative(learningUnit); //TODO poprawić
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
