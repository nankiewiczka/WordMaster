package project.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.Main;
import project.data.DataCSVProvider;
import project.model.LearningEntity;
import project.model.LearningUnit;

import java.io.File;
import java.io.IOException;

public class Controller {

    public static void showStartLearningWindowWhenNoLearningUnit(File selectedFile) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("/sample/startLearningWindow.fxml"));
            Parent root = fxmlLoader.load();
            StartLearningWindowController controller = fxmlLoader.getController();
            LearningUnit learningUnit = new LearningUnit(new DataCSVProvider(selectedFile.getAbsolutePath()).getData(), selectedFile.getAbsolutePath());
            controller.setImportedFileName(learningUnit.getFileName());
            controller.setLearningUnit(learningUnit);
            controller.setImportedWordAmount(Integer.toString(learningUnit.getWordsAmount()));
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void showStartLearningWindowWhenPresentLearningUnit(LearningUnit learningUnit) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("/sample/startLearningWindow.fxml"));
            Parent root = fxmlLoader.load();
            StartLearningWindowController controller = fxmlLoader.getController();
            controller.setImportedFileName(learningUnit.getFileName());
            controller.setLearningUnit(learningUnit);
            controller.setImportedWordAmount(Integer.toString(learningUnit.getWordsAmount()));
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void showLearningWindow(LearningEntity learningEntity) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("/sample/learningWindow.fxml"));
            Parent root = fxmlLoader.load();
            LearningWindowController controller = fxmlLoader.getController();
            controller.setLearningEntity(learningEntity);
            controller.setWordToGuess(learningEntity.getWordForLabel());
            controller.setLearningRate(learningEntity.getWordAmount());
            controller.setRemainsWordsAmount("0/"+Integer.toString(learningEntity.getWordAmount()));
            Stage stage = Main.getMainStage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void showSelectFileWindow(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(Controller.class.getResource("/sample/selectFileWindow.fxml"));
            Main.setWindow(primaryStage);
            primaryStage.setTitle("Word Master");

            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
