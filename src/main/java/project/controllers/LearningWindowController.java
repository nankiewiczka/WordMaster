package project.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import project.Main;
import project.learningEntity.LearningEntity;
import project.models.*;
import java.util.Optional;

public class LearningWindowController {

    private LearningEntity learningEntity;
    private LearningStatistic learningStatistic;

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
        if(learningEntity.isUserInputValid(inputWord.getText().toUpperCase())) {
            learningStatistic.increasePoints();
            changeCorrect(Integer.toString(learningStatistic.getScore()));
            inputWord.setStyle("-fx-control-inner-background: green");
        }
        else {
            inputWord.setStyle("-fx-control-inner-background: red");

        }
        okButton.setDisable(true);
        inputWord.setEditable(false);
    }

    @FXML
    public void switchNextWord() {
        if(!okButton.isDisable()) {
            confirmWord();
        }
        String wordForLabel = learningEntity.getWordForLabel();
        if(wordForLabel != null) {
            changeWordForGuess(wordForLabel);
            inputWord.clear();
            inputWord.setStyle("-fx-control-inner-background: white");
            setRemainsWordsAmount(learningEntity.getRemainWordsNumber(), learningEntity.getAllWordsNumber());
            okButton.setDisable(false);
            inputWord.setEditable(true);

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
        alert.setContentText("You score is: " + learningStatistic.getScore() + "/"
                + learningStatistic.getAvailablePoints() + "." +
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

    public void setLearningStatistic(int availablePoints) {
        this.learningStatistic = new LearningStatistic(availablePoints);
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

    private void changeCorrect(String correct) {
        correctAnswers.textProperty().setValue(correct);
    }


}
