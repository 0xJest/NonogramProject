package edu.neumont.nonogramproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NonogramController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void initialize() {
        // Executes on FXML.load()
    }

}