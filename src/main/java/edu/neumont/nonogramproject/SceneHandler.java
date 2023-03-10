package edu.neumont.nonogramproject;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class SceneHandler {

    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;

    public SceneHandler(Scene main) {
        this.main = main;
    }

    protected void addScene(String name, Pane pane) {
        screenMap.put(name, pane);
    }

    protected void removeScene(String name) {
        screenMap.remove(name);
    }

    protected void activate(String name) {
        Pane scenePane = screenMap.get(name);
        main.setRoot(scenePane);
        Stage stage = (Stage) main.getWindow();
        stage.setWidth(scenePane.getWidth());
        stage.setHeight(scenePane.getHeight());
    }

    // All code hosted in this class was repurposed from StackOverflow.
    // -- MrEbbinghaus (May 17, 2016) How to switch scenes in JavaFX.
    // Stack Overflow. https://stackoverflow.com/questions/37200845/how-to-switch-scenes-in-javafx
}
