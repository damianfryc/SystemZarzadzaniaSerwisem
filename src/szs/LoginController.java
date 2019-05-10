package szs;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {


    @FXML
    private Button loginBtn;


    @FXML
    private Stage primarystage;

    @FXML
    public void openMagazyn(){


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MagazynWindow.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(pane);
       // primarystage.setScene(scene);
        Stage window = new Stage();
        window.setScene(scene);
        window.setTitle("Magazyn");
        window.show();


    }

    @SuppressWarnings("Duplicates")
    @FXML
    public void openKsiegowosc(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("KsiegowoscWindow.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }

        assert pane != null;
        Scene scene = new Scene(pane);
        // primarystage.setScene(scene);
        Stage window = new Stage();
        window.setScene(scene);
        window.setTitle("Ksiegowosc");
        window.show();

    }
}


