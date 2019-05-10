package szs;

import javafx.fxml.FXML;

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
