package project.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import project.data.DataCSVProvider;
import project.model.*;


public class LearningWindowController {
    private LearningEntity learningEntity;
    private LearningRate learningRate;


    public void initialize() {
        correctTitle.textProperty().setValue("Correct:");
        remainTitle.textProperty().setValue("Remain:");
        correct.textProperty().setValue("0");
    }

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

    @FXML
    public void confirmWord() {
        if(learningEntity.checkCorrectness(inputWord.getPromptText())) {
            learningRate.increasePoints();
            changeCorrect(Integer.toString(learningRate.getScore()));
            changeRemain(Integer.toString(learningEntity.getRemainAmount()));
        }
        else {
           // nic
        }
    }

    @FXML
    public void switchNextWord() {
        String wordForLabel = learningEntity.getWordForLabel();
        if(wordForLabel != null) {
            changeWordForGuess(wordForLabel);
        }
        else{
            //mesagebox
        }

    }

    @FXML
    public void quitLearning() {
        //TODO wyswietlenie wyniku, przekierowanie do startLearningWindow
    }


//TODO zrobić oddzielną funkcje dla messageBox, bo 2 razy go będę wywoływać
    public void setLearningEntity(LearningEntity learningEntity) {
        this.learningEntity = learningEntity;
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
