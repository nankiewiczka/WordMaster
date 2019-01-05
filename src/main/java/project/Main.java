package project;

import javafx.application.Application;
import javafx.stage.Stage;
import project.controllers.Controller;

public class Main extends Application {

    private static Stage window;

    public static void main(String[] args) {
        launch(args);
    }

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

}

//TODO
//unit test