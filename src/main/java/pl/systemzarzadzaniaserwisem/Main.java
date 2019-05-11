package pl.systemzarzadzaniaserwisem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void Main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Logowanie");
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}