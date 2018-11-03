package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.controller.Controller;

import java.io.IOException;

public class Main extends Application {

    private static Stage window;

    @Override
    public void start(Stage primaryStage) {
        Controller.showSelectFileWindow(primaryStage);
    }

    public static Stage getMainStage() {
        return window;
    }

    public static void setWindow(Stage window) {
        Main.window = window;
    }

    public static void main(String[] args) {
        launch(args);
    }



}
