module edu.neumont.nonogramproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.neumont.nonogramproject to javafx.fxml;
    exports edu.neumont.nonogramproject;
}