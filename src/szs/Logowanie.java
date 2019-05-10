package szs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Logowanie extends Application {

    @Override
    public void start(Stage Logowanie) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);


        Logowanie.setScene(scene);
        Logowanie.setTitle("Logowanie");
        Logowanie.show();
        Logowanie.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
