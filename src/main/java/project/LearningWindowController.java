package project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import project.model.DataCSVProvider;
import project.model.LearningRate;
import project.model.LearningUnit;
import project.model.Word;

public class LearningWindowController {
//TODO przekazywany chyba w konstruktorze potem poprawić
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
    private Label pointLabel;

    @FXML
    private Label wordToGuess;

    @FXML
    private TextField inputWord;

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
