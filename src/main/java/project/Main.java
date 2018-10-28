package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.model.DataCSVProvider;
import project.model.Word;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/startLearningWindow.fxml"));
        primaryStage.setTitle("Word Master");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        //TODO tylko do testów odczytu
        for(Word w : new DataCSVProvider("data.csv").getData().getWordsList()) {
            System.out.println(w.getForeignWord() + "   " + w.getPolishWord());
        }
    }


    public static void main(String[] args) {
        launch(args);
    }



}
