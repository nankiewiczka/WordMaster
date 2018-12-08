package project.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import project.Main;
import project.learningEntity.LearningEntity;
import project.models.*;
import java.util.Optional;

public class LearningWindowController {

    private LearningEntity learningEntity;
    private LearningRate learningRate;

    @FXML
    private Label titleForCorrectAnswers;

    @FXML
    private Label correctAnswers;

    @FXML
    private Label titleForRemainsWords;

    @FXML
    private Label remainsWordsAmount;

    @FXML
    private Label wordToGuess;

    @FXML
    private TextField inputWord;

    @FXML
    private Button okButton;

    @FXML
    public void confirmWord() {
        if(learningEntity.checkCorrectness(inputWord.getText().toUpperCase())) {
            learningRate.increasePoints();
            changeCorrect(Integer.toString(learningRate.getScore()));
            inputWord.setStyle("-fx-control-inner-background: green");

        }
        else {
            inputWord.setStyle("-fx-control-inner-background: red");

        }
        okButton.setDisable(true);
    }

    @FXML
    public void switchNextWord() {
        String wordForLabel = learningEntity.getWordForLabel();
        if(wordForLabel != null) {
            changeWordForGuess(wordForLabel);
            inputWord.clear();
            inputWord.setStyle("-fx-control-inner-background: white");
            setRemainsWordsAmount(learningEntity.getRemainAmount(), learningEntity.getWordAmount());
            okButton.setDisable(false);
        }
        else {
            quitLearning();
        }
    }

    @FXML
    public void quitLearning() {
        showInfoBox();
    }

    public void initialize() {
        titleForCorrectAnswers.textProperty().setValue("Correct:");
        titleForRemainsWords.textProperty().setValue("Progress:");
        correctAnswers.textProperty().setValue("0");
    }

    private void showInfoBox() {
        Alert alert = new Alert(Alert.AlertType.NONE, "", ButtonType.OK, ButtonType.CLOSE);
        alert.setTitle("Test finished");
        alert.setHeaderText("You finished test.");
        alert.setContentText("You score is: " + learningRate.getScore() + "/"
                + learningRate.getAvailablePoints() + "." +
                "\n Do you want to try again?");
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

    public void setRemainsWordsAmount(int actualNumber, int remainAmount) {
        remainsWordsAmount.textProperty().setValue(Integer.toString(actualNumber) + "/"+ Integer.toString(remainAmount));
    }

    private void changeWordForGuess(String wordForGuess) {
        wordToGuess.textProperty().setValue(wordForGuess);
    }

    private void changeCorrect(String c) {
        correctAnswers.textProperty().setValue(c);
    }


}
