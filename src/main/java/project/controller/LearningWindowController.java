package project.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import project.Main;
import project.model.*;

import java.util.Optional;


public class LearningWindowController {

    private LearningEntity learningEntity;
    private LearningRate learningRate;

    @FXML
    private Label correctTitle;

    @FXML
    private Label correct;

    @FXML
    private Label remainTitle;

    @FXML
    private Label remain;

    @FXML
    private Label wordToGuess;

    @FXML
    private TextField inputWord;

    public void initialize() {
        correctTitle.textProperty().setValue("Correct:");
        remainTitle.textProperty().setValue("Progress:");
        correct.textProperty().setValue("0");
    }

    @FXML
    public void confirmWord() {
        if(learningEntity.checkCorrectness(inputWord.getPromptText())) {
            learningRate.increasePoints();
            changeCorrect(Integer.toString(learningRate.getScore()));
            changeRemain(Integer.toString(learningEntity.getRemainAmount()));
        }
    }

    @FXML
    public void switchNextWord() {
        String wordForLabel = learningEntity.getWordForLabel();
        if(wordForLabel != null) {
            changeWordForGuess(wordForLabel);
        }
        else {
            quitLearning();
        }

    }

    @FXML
    public void quitLearning() {
        showInfoBox();
    }

    private void showInfoBox() {
        Alert alert = new Alert(Alert.AlertType.NONE, "", ButtonType.OK, ButtonType.CLOSE);
        alert.setTitle("Test finished");
        alert.setHeaderText("You finished test.");
        alert.setContentText("You score is: " + learningRate.getScore() + "/"
                + learningRate.getAvailablePoints() + "." + "\n Do you want to try again?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            Controller.showStartLearningWindowWhenPresentLearningUnit(learningEntity.getLearningUnit());
        }
        else {
            Controller.showSelectFileWindow(Main.getMainStage());
        }
    }

    public void setLearningEntity(LearningEntity learningEntity) {
        this.learningEntity = learningEntity;
    }

    public void setLearningRate(int availablePoints) {
        this.learningRate = new LearningRate(availablePoints);
    }

    public void setWordToGuess(String word) {
        wordToGuess.textProperty().setValue(word);
    }

    public void setRemain(String remainAmount) {
        remain.textProperty().setValue(remainAmount);
    }

    private void changeWordForGuess(String wordForGuess) {
        wordToGuess.textProperty().setValue(wordForGuess);
    }

    private void changeCorrect(String c) {
        correct.textProperty().setValue(c);
    }

    private void changeRemain(String r) {
        remain.textProperty().setValue(r);
    }


}
