package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/selectFileWindow.fxml"));
        window=primaryStage;
        primaryStage.setTitle("Word Master");

        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        //TODO tylko do testów odczytu
//        for(Word w : new DataCSVProvider("data.csv").getData().getWordsList()) {
//            System.out.println(w.getForeignWord() + "   " + w.getPolishWord());
//        }
    }

    public static Stage getMainStage() {
        return window;
    }


    public static void main(String[] args) {
        launch(args);
    }



}
