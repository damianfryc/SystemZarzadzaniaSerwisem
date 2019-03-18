package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MagazynControler {

    private LoginController loginControler;

    @FXML
    public void closeMagazyn(){
    }

    @FXML
    public void editMagazyn(){
    }

    public void setLoginControler(LoginController loginControler){
        try {
            this.loginControler = loginControler;
        }catch (Exception exp){
            exp.printStackTrace();
        }
        }

}
