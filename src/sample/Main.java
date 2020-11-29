package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader sceneLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        FXMLLoader sceneLoader2 = new FXMLLoader(getClass().getResource("otherSample.fxml"));
        BorderPane root = (BorderPane) sceneLoader.load();
        BorderPane root2 = (BorderPane) sceneLoader2.load();

        Controller controller = sceneLoader.getController();
        Controller controller2 = sceneLoader2.getController();

        controller.setRoot(root);
        controller.setOtherRoot(root2);
        controller2.setRoot(root2);
        controller2.setOtherRoot(root);

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.getScene().getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        controller.setScene(primaryStage.getScene());
        controller2.setScene(primaryStage.getScene());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
