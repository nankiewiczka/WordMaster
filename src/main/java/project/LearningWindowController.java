package project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import project.data.DataCSVProvider;
import project.model.LearningRate;
import project.model.LearningUnit;
import project.model.Word;


public class LearningWindowController {
    private String learningMode;

    public void setLearningMode(String mode) {
        learningMode = mode;
    }

    private LearningUnit learningUnit = new LearningUnit(new DataCSVProvider("data.csv").getData());
    LearningRate learningRate = new LearningRate(learningUnit.getWordsAmount());

    private Word word = null;
    @FXML
    private Button okButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button endButton;

    @FXML
    private Label progressLabel;


    @FXML
    private Label wordToGuess;

    @FXML
    private TextField inputWord;

    public LearningWindowController() {
    }

    @FXML
    public void confirmWord() {
        //TODO powinno działać też dla enter
        // sprawdzanie poprawności / dodać efekt czerwone/zielone
        //punkty
    }

    @FXML
    public void switchNextWord() {
        if (learningUnit.getNextWord().isPresent())
            wordToGuess.textProperty().setValue(word.getPolishWord());
        else {
            //TODO wurzucić okienko z wynikiem messagebox
        }

    }

    @FXML
    public void quitLearning() {
        //TODO wyswietlenie wyniku, przekierowanie do startLearningWindow
    }


}
