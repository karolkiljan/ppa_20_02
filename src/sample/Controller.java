package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller {
    Scene scene;
    BorderPane root;
    BorderPane otherRoot;

    public BorderPane getOtherRoot() {
        return otherRoot;
    }

    public void setOtherRoot(BorderPane otherRoot) {
        this.otherRoot = otherRoot;
    }

    public BorderPane getRoot() {
        return root;
    }

    public void setRoot(BorderPane root) {
        this.root = root;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    @FXML public void zamiana(ActionEvent event) {
        this.scene.setRoot(otherRoot);
        BorderPane tmp = otherRoot;
        this.setOtherRoot(root);
        this.setRoot(tmp);

    }
}
