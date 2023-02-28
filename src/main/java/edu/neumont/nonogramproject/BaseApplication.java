package edu.neumont.nonogramproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseApplication extends Application {
    public static SceneHandler sh;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BaseApplication.class.getResource("hello-view.fxml"));
        Scene sceneMain = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Nonogram Project");
        stage.setScene(sceneMain);
        stage.show();

        sh = new SceneHandler(sceneMain);
        sh.addScene("hello-view", FXMLLoader.load(getClass().getResource( "hello-view.fxml" )));
    }

    public static void main(String[] args) {
        launch();
    }
}